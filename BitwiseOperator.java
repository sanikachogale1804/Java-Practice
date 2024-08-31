class BitwiseOperator
{
	public static void main(String args[])
	{
		System.out.println(15&18);  // 1111
		                            //10010
									//----------
									//00010
		System.out.println(20|40);  //010100
                                    //101000
                                    //------------
                                    //111100	
        System.out.println(10^30);  //01010
                                    //11110		
									//----------
									//10100
		System.out.println(30^40);  //011110
                                    //101000	
                                    //---------
                                    //110110
        System.out.println(~19);	//0000 0000 0001 0011
		                            //----------
                                    //1111 1111 1110 1100	
        System.out.println(~10); 	//0000 0000 0000 1010	
                                    //1111 1111 1111 0101		
	}
}