package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p128k2.q;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<p102i1.a> f18851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p128k2.a f18852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f18858i;
    public View j;

    public interface a {
        void a(List list, p128k2.a aVar, float f10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18851b = Collections.emptyList();
        this.f18852c = p128k2.a.f41475g;
        this.f18853d = 0.0533f;
        this.f18854e = 0.08f;
        this.f18855f = true;
        this.f18856g = true;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context);
        this.f18858i = aVar;
        this.j = aVar;
        addView(aVar);
        this.f18857h = 1;
    }

    private List<p102i1.a> getCuesWithStylingPreferencesApplied() {
        if (this.f18855f && this.f18856g) {
            return this.f18851b;
        }
        ArrayList arrayList = new ArrayList(this.f18851b.size());
        for (int i10 = 0; i10 < this.f18851b.size(); i10++) {
            p102i1.a.C0382a c0382aA = this.f18851b.get(i10).a();
            if (!this.f18855f) {
                c0382aA.f36539n = false;
                CharSequence charSequence = c0382aA.f36527a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c0382aA.f36527a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c0382aA.f36527a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof p102i1.e)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                q.a(c0382aA);
            } else if (!this.f18856g) {
                q.a(c0382aA);
            }
            arrayList.add(c0382aA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private p128k2.a getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        p128k2.a aVar = p128k2.a.f41475g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return aVar;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new p128k2.a(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & a> void setView(T t8) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof g) {
            ((g) view).f19061c.destroy();
        }
        this.j = t8;
        this.f18858i = t8;
        addView(t8);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f18858i.a(getCuesWithStylingPreferencesApplied(), this.f18852c, this.f18853d, this.f18854e);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f18856g = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f18855f = z10;
        c();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f18854e = f10;
        c();
    }

    public void setCues(List<p102i1.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f18851b = list;
        c();
    }

    public void setFractionalTextSize(float f10) {
        this.f18853d = f10;
        c();
    }

    public void setStyle(p128k2.a aVar) {
        this.f18852c = aVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.f18857h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new androidx.media3.ui.a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new g(getContext()));
        }
        this.f18857h = i10;
    }
}
