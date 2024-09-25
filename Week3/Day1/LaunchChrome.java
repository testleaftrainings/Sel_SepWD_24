package week3.day1;

public class LaunchChrome extends LaunchEdge{

	public void launchBrowser() {
		System.out.println("ChromeDriver");
     }
	public void openChromeSettings() {
		System.out.println("Open Chrome");
      }
	
	public static void main(String[] args) {
		LaunchChrome lc=new LaunchChrome();
		lc.launchBrowser();
		LaunchEdge le=new LaunchEdge();
		le.launchBrowser();
	}
	
}
