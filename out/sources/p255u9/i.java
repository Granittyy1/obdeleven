package p255u9;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/* JADX INFO: compiled from: ManualDB.java */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("Manuals")
public final class i extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47473b = 0;

    public final String a() {
        String string = getString("lang");
        return string == null ? "" : string;
    }
}
