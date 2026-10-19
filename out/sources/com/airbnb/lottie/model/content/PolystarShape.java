package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import p104i3.l;
import p154m3.k;
import p164n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class PolystarShape implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f23400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p154m3.b f23401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k<PointF, PointF> f23402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p154m3.b f23403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p154m3.b f23404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p154m3.b f23405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p154m3.b f23406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p154m3.b f23407i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f23408k;

    public enum Type {
        STAR(1),
        /* JADX INFO: Fake field, exist only in values array */
        POLYGON(2);

        private final int value;

        Type(int i10) {
            this.value = i10;
        }

        public static Type a(int i10) {
            for (Type type : values()) {
                if (type.value == i10) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, p154m3.b bVar, k<PointF, PointF> kVar, p154m3.b bVar2, p154m3.b bVar3, p154m3.b bVar4, p154m3.b bVar5, p154m3.b bVar6, boolean z10, boolean z11) {
        this.f23399a = str;
        this.f23400b = type;
        this.f23401c = bVar;
        this.f23402d = kVar;
        this.f23403e = bVar2;
        this.f23404f = bVar3;
        this.f23405g = bVar4;
        this.f23406h = bVar5;
        this.f23407i = bVar6;
        this.j = z10;
        this.f23408k = z11;
    }

    @Override // p164n3.b
    public final p104i3.b a(LottieDrawable lottieDrawable, p079g3.b bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new l(lottieDrawable, aVar, this);
    }
}
