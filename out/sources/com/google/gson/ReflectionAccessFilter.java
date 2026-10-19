package com.google.gson;

/* JADX INFO: loaded from: classes3.dex */
public interface ReflectionAccessFilter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FilterResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FilterResult f28807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FilterResult f28808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FilterResult f28809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FilterResult f28810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ FilterResult[] f28811f;

        static {
            FilterResult filterResult = new FilterResult("ALLOW", 0);
            f28807b = filterResult;
            FilterResult filterResult2 = new FilterResult("INDECISIVE", 1);
            f28808c = filterResult2;
            FilterResult filterResult3 = new FilterResult("BLOCK_INACCESSIBLE", 2);
            f28809d = filterResult3;
            FilterResult filterResult4 = new FilterResult("BLOCK_ALL", 3);
            f28810e = filterResult4;
            f28811f = new FilterResult[]{filterResult, filterResult2, filterResult3, filterResult4};
        }

        public FilterResult() {
            throw null;
        }

        public static FilterResult valueOf(String str) {
            return (FilterResult) Enum.valueOf(FilterResult.class, str);
        }

        public static FilterResult[] values() {
            return (FilterResult[]) f28811f.clone();
        }
    }

    FilterResult a();
}
