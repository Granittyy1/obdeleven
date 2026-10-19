package W5;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: ElasticTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float fCos;
        float fCos2;
        RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF rectFA2 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            double d10 = (((double) f10) * 3.141592653589793d) / 2.0d;
            fCos2 = (float) (1.0d - Math.cos(d10));
            fCos = (float) Math.sin(d10);
        } else {
            double d11 = (((double) f10) * 3.141592653589793d) / 2.0d;
            float fSin = (float) Math.sin(d11);
            fCos = (float) (1.0d - Math.cos(d11));
            fCos2 = fSin;
        }
        drawable.setBounds(p216r5.a.c(fCos2, (int) rectFA.left, (int) rectFA2.left), drawable.getBounds().top, p216r5.a.c(fCos, (int) rectFA.right, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
