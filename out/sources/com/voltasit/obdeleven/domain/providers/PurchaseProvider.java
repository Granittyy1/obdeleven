package com.voltasit.obdeleven.domain.providers;

import J4.i;
import Q8.d;
import android.app.Activity;
import java.util.ArrayList;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p293xa.r;

/* JADX INFO: compiled from: PurchaseProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface PurchaseProvider {

    /* JADX INFO: compiled from: PurchaseProvider.kt */
    public static abstract class PurchaseException extends Exception {

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class AlreadyOwned extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final AlreadyOwned f30585b = new AlreadyOwned();

            private AlreadyOwned() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class Canceled extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Canceled f30586b = new Canceled();

            private Canceled() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class ConsumeFailure extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final ConsumeFailure f30587b = new ConsumeFailure();

            private ConsumeFailure() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class Disconnected extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Disconnected f30588b = new Disconnected();

            private Disconnected() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class InvalidPurchase extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final InvalidPurchase f30589b = new InvalidPurchase();

            private InvalidPurchase() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class PendingPayment extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final PendingPayment f30590b = new PendingPayment();

            private PendingPayment() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class ProductNotFound extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final ProductNotFound f30591b = new ProductNotFound();

            private ProductNotFound() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class RegionNotSupported extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final RegionNotSupported f30592b = new RegionNotSupported();

            private RegionNotSupported() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class Unavailable extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Unavailable f30593b = new Unavailable();

            private Unavailable() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class Unknown extends PurchaseException {
            private final int code;

            public Unknown(int i10) {
                super(0);
                this.code = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown) && this.code == ((Unknown) obj).code;
            }

            public final int hashCode() {
                return Integer.hashCode(this.code);
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return i.c(this.code, "Unknown(code=", ")");
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class UserNotLoggedIn extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final UserNotLoggedIn f30594b = new UserNotLoggedIn();

            private UserNotLoggedIn() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: PurchaseProvider.kt */
        public static final class WaitingForOperationToFinish extends PurchaseException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final WaitingForOperationToFinish f30595b = new WaitingForOperationToFinish();

            private WaitingForOperationToFinish() {
                super(0);
            }
        }

        public /* synthetic */ PurchaseException(int i10) {
            this();
        }

        private PurchaseException() {
        }
    }

    /* JADX INFO: compiled from: PurchaseProvider.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f30597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f30598c;

        public a(String id, String title, String str) {
            kotlin.jvm.internal.i.e(id, "id");
            kotlin.jvm.internal.i.e(title, "title");
            this.f30596a = id;
            this.f30597b = title;
            this.f30598c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f30596a, aVar.f30596a) && kotlin.jvm.internal.i.a(this.f30597b, aVar.f30597b) && kotlin.jvm.internal.i.a(this.f30598c, aVar.f30598c);
        }

        public final int hashCode() {
            return this.f30598c.hashCode() + B1.a.b(this.f30597b, this.f30596a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProductInfo(id=");
            sb2.append(this.f30596a);
            sb2.append(", title=");
            sb2.append(this.f30597b);
            sb2.append(", price=");
            return d.a(sb2, this.f30598c, ")");
        }
    }

    String a(PurchaseException purchaseException);

    Object b(Activity activity, String str, p040d1.a aVar, c cVar);

    r c();

    Object d(Activity activity, String str, p040d1.a aVar, c cVar);

    Object e(Activity activity, p040d1.a aVar, c cVar);

    Object f(ArrayList arrayList, ContinuationImpl continuationImpl);
}
