package p255u9;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/* JADX INFO: renamed from: u9.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: EngineDB.java */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("Engine")
public final class C2802e extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47469b = 0;

    public final String a() {
        String string = getString("engine");
        return string == null ? "" : string;
    }
}
