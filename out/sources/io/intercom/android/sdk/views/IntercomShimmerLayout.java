package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import p300y4.b;
import p300y4.d;

/* JADX INFO: loaded from: classes.dex */
public class IntercomShimmerLayout extends d {
    private static final b SHIMMER_CONFIG;

    static {
        b.a aVar = new b.a();
        aVar.f48284a.f48276m = 0.0f;
        SHIMMER_CONFIG = aVar.f(0.01f).d(1500L).e(0.6f).g(100L).a();
    }

    public IntercomShimmerLayout(Context context) {
        super(context);
        init();
    }

    private void init() {
        setShimmer(SHIMMER_CONFIG);
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        init();
    }
}
