package com.overload.constructor;

  class Insurance
        {
            Insurance(String Insurancename)
            {
                System.out.println("Insurancename:"+Insurancename);
            }
            Insurance(int InsuranceId)
            {
                System.out.println("Insuranceid:"+InsuranceId);
            }
        }
        public class Insuranceoverload {
    public static void main(String[] args) {
        Insurance I1=new Insurance("LIC");
        Insurance I2=new Insurance(7);
    }
}
