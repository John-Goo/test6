package com.demo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

public class TcpClientDemo {

	public static void main(String[] args) {
		{
			try
			{
				String ip ="test.i2lab.cc";
				String port ="8889";
			
				//Ω®¡¢Socket
				Socket s=new Socket(InetAddress.getByName(ip),Integer.parseInt(port));
				InputStream ips=s.getInputStream();
				OutputStream ops=s.getOutputStream();
				
				
				//BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));//º¸≈Ã ‰»Î
				DataOutputStream dos = new DataOutputStream(ops);
				//BufferedReader brNet = new BufferedReader(new InputStreamReader(ips));
				int count = 0;
		 
				while(true)
				{
					while(true){
						count++;
						long start = System.currentTimeMillis();
						String strWord = String.valueOf(new Date().getTime());
						//dos.writeBytes(strWord + System.getProperty("line.separator"));
						dos.writeUTF("index:"+count+","+strWord+"\n");
						System.out.println("index:"+count+","+strWord+"\n");
						dos.flush();
						long end = System.currentTimeMillis();
						dos.writeUTF("total time(s):£∫"+((end-start)/1000)+"****************\\n");
						dos.flush();
						System.out.println("total time(s):£∫"+((end-start)/1000)+"****************\\n");
						Thread.sleep(6*60*1000);
						
						
					}
				
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			}

	

	}

}
