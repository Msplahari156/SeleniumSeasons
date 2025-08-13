package browserlaunching;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
  new EdgeDriver();
	//download msedgedriver.exe from below path
  //https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/?form=MA13LH#downloads
  //check the version of edge and download the respective driver & set property as above
	}

}
