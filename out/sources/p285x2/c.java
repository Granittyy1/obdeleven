package p285x2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public interface c extends Closeable {

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47884a;

        public a(int i10) {
            this.f47884a = i10;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = i.g(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }

        public abstract void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11);

        public abstract void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i10, int i11);
    }

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f47885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f47887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f47888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f47889e;

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            i.e(callback, "callback");
            this.f47885a = context;
            this.f47886b = str;
            this.f47887c = callback;
            this.f47888d = z10;
            this.f47889e = z11;
        }
    }

    /* JADX INFO: renamed from: x2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    public interface InterfaceC0549c {
        c a(b bVar);
    }

    p285x2.b b0();

    void setWriteAheadLoggingEnabled(boolean z10);
}
