package com.braze.support;

import Ia.q;
import android.util.Log;
import com.braze.Constants;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeLogger {
    private static final int DESIRED_MAX_BRAZE_TAG_LENGTH = 80;
    private static final String LOG_LEVEL_PROPERTY_NAME = "log.tag.APPBOY";
    private static final int MAX_REMAINING_LENGTH_FOR_CLASS_TAG = 65;
    public static final int SUPPRESS = Integer.MAX_VALUE;
    public static final int VERBOSE = 2;
    private static boolean hasLogLevelBeenSetForAppRun;
    private static boolean isSystemPropLogLevelSet;
    private static q<? super Priority, ? super String, ? super Throwable, r> onLoggedCallback;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    public enum Priority {
        D(3),
        I(4),
        E(6),
        V(2),
        W(5);

        private final int logLevel;

        Priority(int i10) {
            this.logLevel = i10;
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24278a;

        static {
            int[] iArr = new int[Priority.values().length];
            try {
                iArr[Priority.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Priority.I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Priority.E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Priority.W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Priority.V.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24278a = iArr;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ia.a f24279b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ia.a aVar) {
            super(0);
            this.f24279b = aVar;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return BrazeLogger.INSTANCE.toStringSafe(this.f24279b);
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f24280b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("BrazeLogger log level set to "), this.f24280b, " via device system property. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.");
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24281b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f24281b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f24281b;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24282b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f24282b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f24282b;
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f24283b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f24283b;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24284b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10) {
            super(0);
            this.f24284b = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: " + this.f24284b;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f24285b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f24285b;
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f24286b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f24286b;
        }
    }

    private BrazeLogger() {
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th, Ia.a aVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            priority = Priority.D;
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        brazeLogger.brazelog(obj, priority, th, (Ia.a<String>) aVar);
    }

    public static final synchronized void checkForSystemLogLevelProperty(boolean z10) {
        String strA = com.braze.support.i.a(LOG_LEVEL_PROPERTY_NAME);
        if ("verbose".equalsIgnoreCase(n.p0(strA).toString())) {
            setLogLevel(2);
            isSystemPropLogLevelSet = true;
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, brazeLogger, Priority.I, (Throwable) null, new c(strA), 2, (Object) null);
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        checkForSystemLogLevelProperty(z10);
    }

    public static final void d(String tag, String msg) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        d$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void d$default(String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        d(str, str2, th);
    }

    public static final void e(String tag, String msg, Throwable tr) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        kotlin.jvm.internal.i.e(tr, "tr");
        INSTANCE.brazelog(tag, Priority.D, tr, (Ia.a<String>) new e(msg));
    }

    public static final synchronized void enableVerboseLogging() {
        setLogLevel(2);
    }

    public static final String getBrazeLogTag(Class<?> classForTag) {
        kotlin.jvm.internal.i.e(classForTag, "classForTag");
        String name = classForTag.getName();
        int length = name.length();
        if (length > 65) {
            name = name.substring(length - 65);
            kotlin.jvm.internal.i.d(name, "this as java.lang.String).substring(startIndex)");
        }
        return Constants.LOG_TAG_PREFIX.concat(name);
    }

    public static final int getLogLevel() {
        return logLevel;
    }

    public static final q<Priority, String, Throwable, r> getOnLoggedCallback() {
        return onLoggedCallback;
    }

    public static final void i(String tag, String msg) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        i$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void i$default(String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        i(str, str2, th);
    }

    public static final void resetForTesting() {
        isSystemPropLogLevelSet = false;
        hasLogLevelBeenSetForAppRun = false;
        onLoggedCallback = null;
    }

    public static final synchronized void setInitialLogLevelFromConfiguration(int i10) {
        if (!hasLogLevelBeenSetForAppRun) {
            setLogLevel(i10);
        }
    }

    public static final synchronized void setLogLevel(int i10) {
        try {
            if (isSystemPropLogLevelSet) {
                BrazeLogger brazeLogger = INSTANCE;
                brazelog$default(brazeLogger, brazeLogger, Priority.W, (Throwable) null, new g(i10), 2, (Object) null);
            } else {
                hasLogLevelBeenSetForAppRun = true;
                logLevel = i10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final void setOnLoggedCallback(q<? super Priority, ? super String, ? super Throwable, r> qVar) {
        onLoggedCallback = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringSafe(Ia.a<? extends Object> aVar) {
        try {
            return String.valueOf(aVar.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    public static final void v(String tag, String msg) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        v$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void v$default(String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        v(str, str2, th);
    }

    public static final void w(String tag, String msg) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        w$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    public final String brazeLogTag(Object obj) {
        kotlin.jvm.internal.i.e(obj, "<this>");
        String name = obj.getClass().getName();
        String strM0 = n.m0(name, '$');
        String strL0 = n.l0('.', strM0, strM0);
        return strL0.length() == 0 ? getBrazeLogTag(name) : getBrazeLogTag(strL0);
    }

    public final void brazelog(Object obj, Priority priority, Throwable th, Ia.a<String> message) {
        kotlin.jvm.internal.i.e(obj, "<this>");
        kotlin.jvm.internal.i.e(priority, "priority");
        kotlin.jvm.internal.i.e(message, "message");
        if (logLevel <= priority.getLogLevel()) {
            brazelog(brazeLogTag(obj), priority, th, message);
        }
    }

    public static final void d(String tag, String msg, Throwable th) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        INSTANCE.brazelog(tag, Priority.D, th, (Ia.a<String>) new d(msg));
    }

    public static final void i(String tag, String msg, Throwable th) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        INSTANCE.brazelog(tag, Priority.I, th, (Ia.a<String>) new f(msg));
    }

    public static final void v(String tag, String msg, Throwable th) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        INSTANCE.brazelog(tag, Priority.V, th, (Ia.a<String>) new h(msg));
    }

    public static final void w(String tag, String msg, Throwable th) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        INSTANCE.brazelog(tag, Priority.W, th, (Ia.a<String>) new i(msg));
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th, Ia.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            priority = Priority.D;
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        brazeLogger.brazelog(str, priority, th, (Ia.a<String>) aVar);
    }

    public final void brazelog(String tag, Priority priority, Throwable th, Ia.a<String> message) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(priority, "priority");
        kotlin.jvm.internal.i.e(message, "message");
        p293xa.g gVarA = kotlin.a.a(new b(message));
        q<? super Priority, ? super String, ? super Throwable, r> qVar = onLoggedCallback;
        if (qVar != null) {
            qVar.invoke(priority, gVarA.getValue(), th);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i10 = a.f24278a[priority.ordinal()];
            if (i10 == 1) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i10 == 2) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i10 == 3) {
                if (th == null) {
                    return;
                } else {
                    Log.e(tag, (String) gVarA.getValue(), th);
                    return;
                }
            }
            if (i10 == 4) {
                if (th == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i10 != 5) {
                return;
            }
            if (th == null) {
            }
        }
    }

    public final String getBrazeLogTag(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return Constants.LOG_TAG_PREFIX.concat(str);
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static /* synthetic */ void getOnLoggedCallback$annotations() {
    }

    public static /* synthetic */ void getSUPPRESS$annotations() {
    }

    public static /* synthetic */ void getVERBOSE$annotations() {
    }
}
