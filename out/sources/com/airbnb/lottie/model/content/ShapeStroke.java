package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import p104i3.r;
import p154m3.d;
import p164n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class ShapeStroke implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p154m3.b f23412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p154m3.a f23414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f23415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p154m3.b f23416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LineCapType f23417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LineJoinType f23418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f23419i;
    public final boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineCapType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final LineCapType f23420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LineCapType[] f23421c;

        static {
            LineCapType lineCapType = new LineCapType("BUTT", 0);
            f23420b = lineCapType;
            f23421c = new LineCapType[]{lineCapType, new LineCapType("ROUND", 1), new LineCapType("UNKNOWN", 2)};
        }

        public LineCapType() {
            throw null;
        }

        public static LineCapType valueOf(String str) {
            return (LineCapType) Enum.valueOf(LineCapType.class, str);
        }

        public static LineCapType[] values() {
            return (LineCapType[]) f23421c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineJoinType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final LineJoinType f23422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LineJoinType[] f23423c;

        static {
            LineJoinType lineJoinType = new LineJoinType("MITER", 0);
            f23422b = lineJoinType;
            f23423c = new LineJoinType[]{lineJoinType, new LineJoinType("ROUND", 1), new LineJoinType("BEVEL", 2)};
        }

        public LineJoinType() {
            throw null;
        }

        public static LineJoinType valueOf(String str) {
            return (LineJoinType) Enum.valueOf(LineJoinType.class, str);
        }

        public static LineJoinType[] values() {
            return (LineJoinType[]) f23423c.clone();
        }
    }

    public ShapeStroke(String str, p154m3.b bVar, ArrayList arrayList, p154m3.a aVar, d dVar, p154m3.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f10, boolean z10) {
        this.f23411a = str;
        this.f23412b = bVar;
        this.f23413c = arrayList;
        this.f23414d = aVar;
        this.f23415e = dVar;
        this.f23416f = bVar2;
        this.f23417g = lineCapType;
        this.f23418h = lineJoinType;
        this.f23419i = f10;
        this.j = z10;
    }

    @Override // p164n3.b
    public final p104i3.b a(LottieDrawable lottieDrawable, p079g3.b bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new r(lottieDrawable, aVar, this);
    }
}
