package androidx.fragment.app.strictmode;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.collections.y;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FragmentStrictMode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentStrictMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17641a = a.f17650b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    public static final class Flag {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Flag f17642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Flag f17643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Flag f17644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Flag f17645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Flag f17646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Flag f17647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Flag f17648h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Flag[] f17649i;

        /* JADX INFO: Fake field, exist only in values array */
        Flag EF0;

        static {
            Flag flag = new Flag("PENALTY_LOG", 0);
            Flag flag2 = new Flag("PENALTY_DEATH", 1);
            Flag flag3 = new Flag("DETECT_FRAGMENT_REUSE", 2);
            f17642b = flag3;
            Flag flag4 = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
            f17643c = flag4;
            Flag flag5 = new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4);
            f17644d = flag5;
            Flag flag6 = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5);
            f17645e = flag6;
            Flag flag7 = new Flag("DETECT_SET_USER_VISIBLE_HINT", 6);
            f17646f = flag7;
            Flag flag8 = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7);
            f17647g = flag8;
            Flag flag9 = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            f17648h = flag9;
            f17649i = new Flag[]{flag, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) f17649i.clone();
        }
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f17650b = new a(EmptySet.f42985b, y.p());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmptySet f17651a;

        public a(EmptySet flags, Map map) {
            i.e(flags, "flags");
            this.f17651a = flags;
            new LinkedHashMap();
            ((EmptySet) map.entrySet()).getClass();
        }
    }

    public static a a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                i.d(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f17641a;
    }

    public static void b(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            violation.a().getClass();
        }
    }

    public static final void c(Fragment fragment, String previousFragmentId) {
        i.e(fragment, "fragment");
        i.e(previousFragmentId, "previousFragmentId");
        b(new FragmentReuseViolation(fragment, previousFragmentId));
        a(fragment).f17651a.contains(Flag.f17642b);
    }
}
