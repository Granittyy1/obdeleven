package p129k3;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import p142l3.e;
import p214r3.c;

/* JADX INFO: compiled from: FontAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AssetManager f41578d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<String> f41575a = new e<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f41576b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41577c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41579e = ".ttf";

    public a(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.f41578d = ((View) callback).getContext().getAssets();
        } else {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f41578d = null;
        }
    }
}
