package InnerClasses;

public class RadioModule {
    public RadioModule(){
        System.out.println("Radiomodule was initialized.");
    }

    public void call(String number ){
        int length =10;
        class GSMModule{//When we declare class inside the method we can only use default access modifier.
            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
            this.phoneNumber=phoneNumber;
            }

            public boolean isValid(){
                if(phoneNumber.length()!=length){
                    return false;
                }else {
                    try{
                        validNumber=Integer.parseInt(phoneNumber);
                        return true;
                }catch(NumberFormatException e){
                       return  false;
                    }
                }
            }

            public void dialIn(){
                if(isValid()){
                    System.out.println("Calling phone number "+ validNumber);
                }else{
                    System.out.println("Phone number is invalid . Please correct phone number");
                }

            }
        }

        GSMModule module=new GSMModule(number);
        module.dialIn();
    }
}
