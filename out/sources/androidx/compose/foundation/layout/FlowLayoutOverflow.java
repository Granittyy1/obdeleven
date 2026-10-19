package androidx.compose.foundation.layout;

import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public abstract class FlowLayoutOverflow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OverflowType f10124a = OverflowType.f10130c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> f10127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> f10128e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    public static final class OverflowType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OverflowType f10129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OverflowType f10130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final OverflowType f10131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final OverflowType f10132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ OverflowType[] f10133f;

        static {
            OverflowType overflowType = new OverflowType("Visible", 0);
            f10129b = overflowType;
            OverflowType overflowType2 = new OverflowType("Clip", 1);
            f10130c = overflowType2;
            OverflowType overflowType3 = new OverflowType("ExpandIndicator", 2);
            f10131d = overflowType3;
            OverflowType overflowType4 = new OverflowType("ExpandOrCollapseIndicator", 3);
            f10132e = overflowType4;
            OverflowType[] overflowTypeArr = {overflowType, overflowType2, overflowType3, overflowType4};
            f10133f = overflowTypeArr;
            kotlin.enums.a.a(overflowTypeArr);
        }

        public OverflowType() {
            throw null;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) f10133f.clone();
        }
    }

    public FlowLayoutOverflow(int i10, int i11, Ia.l lVar, Ia.l lVar2) {
        this.f10125b = i10;
        this.f10126c = i11;
        this.f10127d = lVar;
        this.f10128e = lVar2;
    }
}
