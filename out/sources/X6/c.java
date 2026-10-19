package X6;

import W6.n;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: compiled from: BindingWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p083g7.h f7334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f7335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f7336c;

    public c(n nVar, LayoutInflater layoutInflater, p083g7.h hVar) {
        this.f7335b = nVar;
        this.f7336c = layoutInflater;
        this.f7334a = hVar;
    }

    public static void g(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e10) {
            H3.c.k("Error parsing background color: " + e10.toString() + " color: " + str);
        }
    }

    public static void h(Button button, p083g7.d dVar) {
        String str = dVar.f35616a.f35637b;
        String str2 = dVar.f35617b;
        try {
            Drawable background = button.getBackground();
            p234t0.a.C0532a.g(background, Color.parseColor(str2));
            button.setBackground(background);
        } catch (IllegalArgumentException e10) {
            H3.c.k("Error parsing background color: " + e10.toString());
        }
        button.setText(dVar.f35616a.f35636a);
        button.setTextColor(Color.parseColor(str));
    }

    public n a() {
        return this.f7335b;
    }

    public abstract View b();

    public View.OnClickListener c() {
        return null;
    }

    public abstract ImageView d();

    public abstract ViewGroup e();

    public abstract ViewTreeObserver.OnGlobalLayoutListener f(HashMap map, U6.c cVar);
}
