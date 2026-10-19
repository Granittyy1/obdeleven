package com.facebook.internal;

import p165n4.i;

/* JADX INFO: compiled from: FeatureManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeatureManager.a f25022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeatureManager.Feature f25023b;

    public a(FeatureManager.a aVar, FeatureManager.Feature feature) {
        this.f25022a = aVar;
        this.f25023b = feature;
    }

    @Override // n4.i.a
    public final void a() {
        FeatureManager featureManager = FeatureManager.f24975a;
        this.f25022a.e(FeatureManager.b(this.f25023b));
    }
}
