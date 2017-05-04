package imsi;

public class IMSi {
	 public static void main(String []args) {
		getIMIS_T("");
		getIMSI_L("");
		getIMSIName("");   
		getESN("");
	   
	       
	    }
	 
public static String getIMIS_T(String imsi_t) {
	
     String MCC = imsi_t.substring(0, 3);
    
      String MNC = imsi_t.substring(3, 5);

      String MIN = imsi_t.substring(5,15);

      String min_1 = MIN.substring(0,3);
      
      int in = Integer.parseInt(min_1.substring(0,1));
      int in_0 = Integer.parseInt(min_1.substring(1,2));
      int in_1 = Integer.parseInt(min_1.substring(2,3));

      if (in == 0) {
			in = 10;
		}
      if (in_0 == 0){
      	in_0 = 10;
      }
      if(in_1 == 0){
      	in_1 = 10;
      }
      
      int min_final =  (in*100+in_0*10+in_1)-111;
      
      String hex_Min_1 = Integer.toHexString(min_final);
      int cout_min = 4-hex_Min_1.length();
      for (int i = 0; i < cout_min; i++) {
			hex_Min_1 = "0"+hex_Min_1;
			
		}
      
			String a = hex_Min_1.substring(0, 2);
			String b = hex_Min_1.substring(2,4);
			
			String finalStr = b+a;
			
      
      String min_2 = MIN.substring(3,6);
      
      
      int BB = Integer.parseInt(min_2.substring(0,1));
      int BB_0 = Integer.parseInt(min_2.substring(1,2));
      int BB_1 = Integer.parseInt(min_2.substring(2,3));
     
      if (BB == 0) {
			BB =10;
		}
      if (BB_0 == 0) {
			BB_0 = 10;
		}
      if (BB_1 == 0) {
			BB_1 = 10;
		}
      
      int BB_final =  (BB*100+BB_0*10+BB_1)-111;
      
      String BBdec = Integer.toBinaryString(BB_final);
      
      int count = 10 - BBdec.length();
      for (int i = 0; i < count; i++) {
			BBdec = "0"+BBdec;
			
		}
      
      
      String BB_7 = MIN.substring(6,7);
      
      String BB_7_dec = "";
      if (Integer.parseInt(BB_7) == 0) {
			BB_7_dec = Integer.toBinaryString(10);
			
		}else {
		    BB_7_dec = Integer.toBinaryString(Integer.parseInt(BB_7));
		}
  
      
      int count_BB_7 = 4 - BB_7_dec.length();
      for (int i = 0; i < count_BB_7; i++) {
      	BB_7_dec = "0"+BB_7_dec;
			
		}
      
      
      
          
      
      String BB_7_11 = MIN.substring(7,10);
      
      
      int BB_7_11_0 = Integer.parseInt(BB_7_11.substring(0,1));
      int BB_7_11_1 = Integer.parseInt(BB_7_11.substring(1,2));
      int BB_7_11_2 = Integer.parseInt(BB_7_11.substring(2,3));
      
      if (BB_7_11_0 == 0) {
      	BB_7_11_0 = 10;
		}
      if (BB_7_11_1 == 0){
      	BB_7_11_1 = 10;
      }
      if(BB_7_11_2 == 0){
      	BB_7_11_2 = 10;
      }
      
      int BB_7_11_final =  (BB_7_11_0*100+BB_7_11_1*10+BB_7_11_2)-111;
      
      String BB_7_11_dec = Integer.toBinaryString(BB_7_11_final);
      
      int count_BB_7_11 = 10 - BB_7_11_dec.length();
      for (int i = 0; i < count_BB_7_11; i++) {
      	BB_7_11_dec = "0"+BB_7_11_dec;
		}
     
      
      
      String Min_add_final = BBdec+BB_7_dec+BB_7_11_dec;
     
      
      int c =  Integer.valueOf(Min_add_final,2);
      String str = Integer.toHexString(c);
      
      int add_final_count = 6 - str.length();
      for (int i = 0; i < add_final_count; i++) {
			str = "0"+str;
		}
      
      
      String s1 = str.substring(0, 2);
      String s2 = str.substring(2,4);
      String s3 = str.substring(4,6);
      
      String sFinal = s3+s2+s1;
      
      
      
//      String CC = MNC.substring(0,1);
//      String CC_1 = MNC.substring(1,2);
      int CC = Integer.parseInt(MNC.substring(0,1));
      int CC_1 = Integer.parseInt(MNC.substring(1,2));
      if (CC == 0){
      	CC = 10;
      }
      if (CC_1 == 0) {
			CC_1 = 10;
		}
      
      int C = CC*10+CC_1-11 ;
     
      
      String CC_hex = Integer.toHexString(C);
      

      
     int DD  = Integer.parseInt(MCC.substring(0,1));
     int DD_0 = Integer.parseInt(MCC.substring(1,2));
     int DD_1 = Integer.parseInt(MCC.substring(2,3));
     

     if (DD == 0) {
		DD = 10;
     		}
     if (DD_0 == 0) {
		DD_0 = 10;
     		}
     if (DD_1 == 0) {
		DD_1 = 10;
     		}
 int D_D =  DD*100+DD_0*10+DD_1-111;
 
 String d = Integer.toHexString(D_D);
 
 int count_d = 4-d.length();
 for (int i = 0; i < count_d; i++) {
	d = "0"+d;
}
 
 String d1 = d.substring(0,2);
 String d2 = d.substring(2,4);
 
 String dd_final = d2+d1;

 
 
 String FinalSIM = "00"+finalStr+sFinal+CC_hex+"80"+dd_final;
 
 System.out.println("IMSI_T:     "+FinalSIM.toUpperCase());
 
 	return FinalSIM.toUpperCase();
	
}	 
public static String  getIMSI_L(String imsi_l) {
	
		 			
		 String IMSI_L_9 = "9"+imsi_l;
		 String im = new String();
		 String buf = new String();
		 StringBuffer imsi_final = new StringBuffer();
		 for (int i = 0;i<16;i++){
			 if ((i%2) == 0) {
				 im = im+IMSI_L_9.charAt(i); 
			}else {
				buf = buf+IMSI_L_9.charAt(i);
			}
		 }
		 for (int t = 0;t< 8;t++){
			(imsi_final.append(buf.charAt(t))).append(im.charAt(t));
		 }
		
		 System.out.println("IMSI_L:     "+imsi_final);
		 
		 return imsi_final.toString();
		// IMSI_L.charAt(0);
		 
	}

	public static String getIMSIName (String IMSI_name) {
		
		
		StringBuffer imsiName = new StringBuffer();
		for (int i = 0; i < 15; i++) {
			(imsiName.append('3')).append(IMSI_name.charAt(i));
		}
		System.out.println("imsiName:   "+imsiName);
		
		
		return imsiName.toString();
	}
	
	
	
	public static String getESN(String esn) {
		
		
		
		
		String str1 = esn.substring(0, 2);
		String str2 = esn.substring(2, 4);
		String str3 = esn.substring(4, 6);
		String str4 = esn.substring(6, 8);
	
		
		String esn_final = "04"+str4+str3+str2+str1+"000000";
		System.out.println("esn_final:  "+esn_final);
		
		
		return esn_final;
		
	}
}
