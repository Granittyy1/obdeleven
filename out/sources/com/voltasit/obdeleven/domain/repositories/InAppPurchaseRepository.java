package com.voltasit.obdeleven.domain.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.a;

/* JADX INFO: compiled from: InAppPurchaseRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface InAppPurchaseRepository {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: InAppPurchaseRepository.kt */
    public static final class Result {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Result f30599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Result f30600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Result f30601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Result f30602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Result f30603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Result f30604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Result[] f30605h;

        static {
            Result result = new Result("OK", 0);
            f30599b = result;
            Result result2 = new Result("ALREADY_PURCHASED_ERROR", 1);
            f30600c = result2;
            Result result3 = new Result("INVALID_PURCHASE_ERROR", 2);
            f30601d = result3;
            Result result4 = new Result("PRODUCT_NOT_FOUND_ERROR", 3);
            f30602e = result4;
            Result result5 = new Result("PURCHASE_PENDING_ERROR", 4);
            f30603f = result5;
            Result result6 = new Result("PURCHASE_CANCELED_ERROR", 5);
            f30604g = result6;
            Result[] resultArr = {result, result2, result3, result4, result5, result6};
            f30605h = resultArr;
            a.a(resultArr);
        }

        public Result() {
            throw null;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) f30605h.clone();
        }
    }

    Object a(String str, String str2, String str3, ContinuationImpl continuationImpl);
}
