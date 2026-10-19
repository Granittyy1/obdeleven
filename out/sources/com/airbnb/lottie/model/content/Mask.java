package com.airbnb.lottie.model.content;

import p154m3.d;
import p154m3.g;

/* JADX INFO: loaded from: classes.dex */
public final class Mask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaskMode f23382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f23383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f23384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23385d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MaskMode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MaskMode f23386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MaskMode f23387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final MaskMode f23388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final MaskMode f23389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ MaskMode[] f23390f;

        static {
            MaskMode maskMode = new MaskMode("MASK_MODE_ADD", 0);
            f23386b = maskMode;
            MaskMode maskMode2 = new MaskMode("MASK_MODE_SUBTRACT", 1);
            f23387c = maskMode2;
            MaskMode maskMode3 = new MaskMode("MASK_MODE_INTERSECT", 2);
            f23388d = maskMode3;
            MaskMode maskMode4 = new MaskMode("MASK_MODE_NONE", 3);
            f23389e = maskMode4;
            f23390f = new MaskMode[]{maskMode, maskMode2, maskMode3, maskMode4};
        }

        public MaskMode() {
            throw null;
        }

        public static MaskMode valueOf(String str) {
            return (MaskMode) Enum.valueOf(MaskMode.class, str);
        }

        public static MaskMode[] values() {
            return (MaskMode[]) f23390f.clone();
        }
    }

    public Mask(MaskMode maskMode, g gVar, d dVar, boolean z10) {
        this.f23382a = maskMode;
        this.f23383b = gVar;
        this.f23384c = dVar;
        this.f23385d = z10;
    }
}
