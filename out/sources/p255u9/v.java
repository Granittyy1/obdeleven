package p255u9;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/* JADX INFO: compiled from: TexttableDB.java */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("Texttable")
public final class v extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47482b = 0;

    public final String a(String str) {
        String string = getString(str);
        if (string != null) {
            return string;
        }
        String string2 = getString("en");
        return string2 != null ? string2 : "";
    }
}
