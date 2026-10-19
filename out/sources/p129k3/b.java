package p129k3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: ImageAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f41580d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41583c;

    public b(Drawable.Callback callback, HashMap map) {
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.f41582b = null;
        this.f41583c = map;
        if (callback instanceof View) {
            this.f41581a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f41581a = null;
        }
    }
}
