package Fa;

import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {
    public static File q(File file) {
        int length;
        File file2;
        int iP;
        File file3 = new File("image_cache");
        String path = file3.getPath();
        i.d(path, "getPath(...)");
        char c10 = File.separatorChar;
        int iP2 = n.P(path, c10, 0, false, 4);
        if (iP2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c10 || (iP = n.P(path, c10, 2, false, 4)) < 0) {
                length = 1;
            } else {
                int iP3 = n.P(path, c10, iP + 1, false, 4);
                length = iP3 >= 0 ? iP3 + 1 : path.length();
            }
        } else if (iP2 <= 0 || path.charAt(iP2 - 1) != ':') {
            length = (iP2 == -1 && n.L(path, ':')) ? path.length() : 0;
        } else {
            length = iP2 + 1;
        }
        if (length > 0) {
            return file3;
        }
        String string = file.toString();
        i.d(string, "toString(...)");
        if ((string.length() == 0) || n.L(string, c10)) {
            file2 = new File(string + file3);
        } else {
            file2 = new File(string + c10 + file3);
        }
        return file2;
    }
}
