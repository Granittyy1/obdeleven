package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import p104i3.j;
import p164n3.b;
import p214r3.c;

/* JADX INFO: loaded from: classes.dex */
public final class MergePaths implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MergePathsMode f23391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23392b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MergePathsMode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MergePathsMode f23393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MergePathsMode f23394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final MergePathsMode f23395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final MergePathsMode f23396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final MergePathsMode f23397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ MergePathsMode[] f23398g;

        static {
            MergePathsMode mergePathsMode = new MergePathsMode("MERGE", 0);
            f23393b = mergePathsMode;
            MergePathsMode mergePathsMode2 = new MergePathsMode("ADD", 1);
            f23394c = mergePathsMode2;
            MergePathsMode mergePathsMode3 = new MergePathsMode("SUBTRACT", 2);
            f23395d = mergePathsMode3;
            MergePathsMode mergePathsMode4 = new MergePathsMode("INTERSECT", 3);
            f23396e = mergePathsMode4;
            MergePathsMode mergePathsMode5 = new MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
            f23397f = mergePathsMode5;
            f23398g = new MergePathsMode[]{mergePathsMode, mergePathsMode2, mergePathsMode3, mergePathsMode4, mergePathsMode5};
        }

        public MergePathsMode() {
            throw null;
        }

        public static MergePathsMode valueOf(String str) {
            return (MergePathsMode) Enum.valueOf(MergePathsMode.class, str);
        }

        public static MergePathsMode[] values() {
            return (MergePathsMode[]) f23398g.clone();
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z10) {
        this.f23391a = mergePathsMode;
        this.f23392b = z10;
    }

    @Override // p164n3.b
    public final p104i3.b a(LottieDrawable lottieDrawable, p079g3.b bVar, com.airbnb.lottie.model.layer.a aVar) {
        if (lottieDrawable.j) {
            return new j(this);
        }
        c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f23391a + '}';
    }
}
