package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import p104i3.h;
import p154m3.c;
import p154m3.d;
import p154m3.e;
import p164n3.b;

/* JADX INFO: compiled from: GradientStroke.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GradientType f23433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f23434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f23435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f23436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f23437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p154m3.b f23438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShapeStroke.LineCapType f23439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ShapeStroke.LineJoinType f23440i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f23441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p154m3.b f23442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f23443m;

    public a(String str, GradientType gradientType, c cVar, d dVar, e eVar, e eVar2, p154m3.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f10, ArrayList arrayList, p154m3.b bVar2, boolean z10) {
        this.f23432a = str;
        this.f23433b = gradientType;
        this.f23434c = cVar;
        this.f23435d = dVar;
        this.f23436e = eVar;
        this.f23437f = eVar2;
        this.f23438g = bVar;
        this.f23439h = lineCapType;
        this.f23440i = lineJoinType;
        this.j = f10;
        this.f23441k = arrayList;
        this.f23442l = bVar2;
        this.f23443m = z10;
    }

    @Override // p164n3.b
    public final p104i3.b a(LottieDrawable lottieDrawable, p079g3.b bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new h(lottieDrawable, aVar, this);
    }
}
