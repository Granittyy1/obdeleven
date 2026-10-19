package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import p104i3.s;
import p164n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class ShapeTrimPath implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f23424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p154m3.b f23425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p154m3.b f23426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p154m3.b f23427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23428e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f23429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f23430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f23431d;

        static {
            Type type = new Type("SIMULTANEOUSLY", 0);
            f23429b = type;
            Type type2 = new Type("INDIVIDUALLY", 1);
            f23430c = type2;
            f23431d = new Type[]{type, type2};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f23431d.clone();
        }
    }

    public ShapeTrimPath(String str, Type type, p154m3.b bVar, p154m3.b bVar2, p154m3.b bVar3, boolean z10) {
        this.f23424a = type;
        this.f23425b = bVar;
        this.f23426c = bVar2;
        this.f23427d = bVar3;
        this.f23428e = z10;
    }

    @Override // p164n3.b
    public final p104i3.b a(LottieDrawable lottieDrawable, p079g3.b bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new s(aVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f23425b + ", end: " + this.f23426c + ", offset: " + this.f23427d + "}";
    }
}
