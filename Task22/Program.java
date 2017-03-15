
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Program {

	final static int BRACKET_STACK_SIZE = 1024;

	public static void main(String args[]) {

		//Check
		if (args.length == 0) {

			System.out.printf("Error: Few args!\n");
			System.out.printf("Usage: java Programm [path/to/file]\n");
			System.exit(-1);
		}

		System.out.printf("File to read: %s\n\n", args[0]);

		File file = new File(args[0]);

		FileInputStream     fis = null;
		BufferedInputStream bis = null;
		DataInputStream     dis = null;

		try { 

			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

			int errorTotal = 0;

			ArrayStack bracketStack = new ArrayStack(BRACKET_STACK_SIZE);

			int lineCounter = 0;
			int firstErrorLine = 0;
			int firstErrorColumnt = 0;

			//Read File line by line from buffer
			while (dis.available() != 0) {

				lineCounter++;

				String curStr = dis.readLine();

				ArrayList symbolList = new ArrayList(curStr.length());
				ArrayList errorList = new ArrayList(curStr.length());

				int errorCounter = 0;

				for (int i=0; i<curStr.length(); i++) {
					
					symbolList.addNext(curStr.charAt(i));

					boolean isError = false;

					switch (curStr.charAt(i)) {

						case '(': //()
						
							bracketStack.push(curStr.charAt(i));
							break;

						case ')':

							if ('(' == bracketStack.view()) {
								
								bracketStack.pop();
							}
							
							else {

								isError = true;
							}

							break;

						case '[': //[]
							 
							 bracketStack.push(curStr.charAt(i));
							 break;

						case ']':

							if ('[' == bracketStack.view()) {
								
								bracketStack.pop();
							}

							else {

								isError = true;
							}

							break;

						case '{':
							
							bracketStack.push(curStr.charAt(i));
							break;

						case '}':

							if ('{' == bracketStack.view()) {
								
								bracketStack.pop();
							}

							else {

								isError = true;
							}

							break;

						default:
						break;
					}


					if (isError) {

						errorCounter++;
						errorList.addNext('^');

						if (firstErrorLine == 0 && firstErrorColumnt == 0) {

							firstErrorLine = lineCounter;
							firstErrorColumnt = i + 1;
						}
					}	

					else {

						errorList.addNext('-');
					}	

				}//end of for

				symbolList.println();
				
				if (errorCounter > 0) {
					
					errorTotal+=errorCounter;
					errorList.println();	
				}

				//bracketStack.println();
				
			}//end of while

			System.out.printf("\n%s: %d\n", "Errors Total", errorTotal);

			if (errorTotal > 0) {
			
				System.out.printf( "First Error in: %d Line %d Column\n", 
					               firstErrorLine, 
					               firstErrorColumnt
					              );
			}

			fis.close();
			bis.close();
			dis.close();

		}//end of try

		catch (FileNotFoundException e) {

			e.printStackTrace();
			System.exit(-2);

		}//end of catch

		catch (IOException e) {

			e.printStackTrace();
			System.exit(-3);

		}//end fo LAST catch
		
	}//end of main()	

}//end of Programm