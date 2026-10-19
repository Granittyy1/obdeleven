package com.google.android.play.integrity.internal;

import android.content.Context;
import android.view.View;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import com.google.android.material.appbar.AppBarLayout;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p131k5.H0;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements j, H0, InterfaceC1309y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f27754b;

    public /* synthetic */ k(Object obj) {
        this.f27754b = obj;
    }

    @Override // com.google.android.play.integrity.internal.m
    public Object a() {
        return (Context) this.f27754b;
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View view, n0 n0Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f27754b;
        appBarLayout.getClass();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        n0 n0Var2 = appBarLayout.getFitsSystemWindows() ? n0Var : null;
        if (!Objects.equals(appBarLayout.f26665h, n0Var2)) {
            appBarLayout.f26665h = n0Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.f26678v != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return n0Var;
    }

    public k() {
        this.f27754b = new ConcurrentHashMap();
    }

    @Override // p131k5.H0
    public void a(String str, int i10, IOException iOException, byte[] bArr, Map map) {
        ((com.google.android.gms.measurement.internal.h) this.f27754b).p(str, i10, iOException, bArr, map);
    }
}
