package com.benjaminfaal.ps4remotepkginstaller.util;

import java.nio.file.Path;
import java.nio.file.Paths;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {

    public Path getWorkingDirectory() {
        return Paths.get(Utils.class.getProtectionDomain().getPermissions()
            .elements().nextElement().getName()).getParent();
    }
}
