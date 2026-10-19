package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements p191p5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28270c;

    public /* synthetic */ D(Object obj, boolean z10) {
        this.f28270c = obj;
        this.f28269b = z10;
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = E.a((Context) this.f28270c).edit();
        editorEdit.putBoolean("proxy_retention", this.f28269b);
        editorEdit.apply();
    }
}
