package g4rb4g3.at.ctsteststarter;

import android.content.pm.ApplicationInfo;

public class LaunchableApplicationInfo extends ApplicationInfo {
  public boolean isLaunchable;

  public LaunchableApplicationInfo(ApplicationInfo applicationInfo, boolean isLaunchable) {
    super(applicationInfo);
    this.isLaunchable = isLaunchable;
  }
}
