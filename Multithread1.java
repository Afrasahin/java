class Multithread1 extends Thread{
		private String ThreadName;

		Multithread1(String name)
		{
			this.ThreadName=name;
		}
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(ThreadName +"-Count:"+i);
				try{
					Thread.sleep(500);
				}catch(InterruptedException e){
					System.out.println(ThreadName+"Interrupted");
				}
			}
			System.out.println(ThreadName +"finished");
				
			}
			public static void main(String args[])
			{
				Multithread1 t1 = new Multithread1("thread-1");

				Multithread1 t2 = new Multithread1("thread-2");

				Multithread1 t3 = new Multithread1("thread-3");

				t1.start();

				t2.start();

				t3.start();
				
			}
		}