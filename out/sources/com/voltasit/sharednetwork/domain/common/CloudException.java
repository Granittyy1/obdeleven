package com.voltasit.sharednetwork.domain.common;

import kotlin.jvm.internal.i;
import kotlin.text.l;
import kotlin.text.m;

/* JADX INFO: compiled from: CloudException.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CloudException extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34455b = 0;

    /* JADX INFO: compiled from: CloudException.kt */
    public static final class AccountLockedDueToMultipleAttemptsException extends CloudException {
        private final String time;

        public AccountLockedDueToMultipleAttemptsException(String str) {
            super("Your account is locked due to multiple failed login attempts.");
            this.time = str;
        }

        public final String a() {
            return this.time;
        }
    }

    /* JADX INFO: compiled from: CloudException.kt */
    public static final class InvalidSessionException extends CloudException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InvalidSessionException f34456c = new InvalidSessionException();

        private InvalidSessionException() {
            super("Invalid session");
        }
    }

    /* JADX INFO: compiled from: CloudException.kt */
    public static final class NotFoundException extends CloudException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final NotFoundException f34457c = new NotFoundException();

        private NotFoundException() {
            super("Not found");
        }
    }

    /* JADX INFO: compiled from: CloudException.kt */
    public static final class ParseNotFoundException extends CloudException {
        private final int code;
        private final String message;

        public ParseNotFoundException(int i10, String str) {
            super(str);
            this.code = i10;
            this.message = str;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    /* JADX INFO: compiled from: CloudException.kt */
    public static final class ServerException extends CloudException {
    }

    /* JADX INFO: compiled from: CloudException.kt */
    public static final class TooManySessionsException extends CloudException {
        private final int sessionCount;

        public TooManySessionsException(int i10) {
            super("Too many sessions");
            this.sessionCount = i10;
        }

        public final int a() {
            return this.sessionCount;
        }
    }

    /* JADX INFO: compiled from: CloudException.kt */
    public static final class UnknownCloudException extends CloudException {
        private final int code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownCloudException(int i10, String message) {
            super(message);
            i.e(message, "message");
            this.code = i10;
        }

        public final int a() {
            return this.code;
        }
    }

    /* JADX INFO: compiled from: CloudException.kt */
    public static final class a {
        public static CloudException a(int i10, String message) {
            i.e(message, "message");
            if (i10 == 101) {
                if (!m.I(message, "Your account is locked due to multiple failed login attempts.", false)) {
                    return new UnknownCloudException(i10, message);
                }
                StringBuilder sb2 = new StringBuilder();
                int length = message.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = message.charAt(i11);
                    if (Character.isDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                String string = sb2.toString();
                i.d(string, "toString(...)");
                return new AccountLockedDueToMultipleAttemptsException(string);
            }
            if (i10 == 141) {
                return new ServerException(message);
            }
            if (i10 == 209) {
                return InvalidSessionException.f34456c;
            }
            if (i10 != 1006) {
                return new UnknownCloudException(i10, message);
            }
            StringBuilder sb3 = new StringBuilder();
            int length2 = message.length();
            for (int i12 = 0; i12 < length2; i12++) {
                char cCharAt2 = message.charAt(i12);
                if (Character.isDigit(cCharAt2)) {
                    sb3.append(cCharAt2);
                }
            }
            String string2 = sb3.toString();
            i.d(string2, "toString(...)");
            Integer numA = l.A(string2);
            return (!m.I(message, "Session limit reached", false) || numA == null) ? new UnknownCloudException(i10, message) : new TooManySessionsException(numA.intValue());
        }
    }
}
