//REF: https://www.oodesign.com/single-responsibility-principle.html

package SingleResponsibility;

class Email implements IEmail {
	public void setSender(String sender) {
        // set sender; 
    }
	public void setReceiver(String receiver) {
        // set receiver; 
    }
	public void setContent(Content content) {
        return ;
    }
}