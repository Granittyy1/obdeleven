package K2;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: WorkDatabasePathHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {
    public static final void a(Context context) {
        Map mapO;
        kotlin.jvm.internal.i.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.i.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            androidx.work.k kVarC = androidx.work.k.c();
            String[] strArr = B.f4138a;
            kVarC.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.i.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C0708a.f4188a.a(context), "androidx.work.workdb");
            String[] strArr2 = B.f4138a;
            int iN = kotlin.collections.x.n(strArr2.length);
            if (iN < 16) {
                iN = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
            for (String str : strArr2) {
                Pair pair = new Pair(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
                linkedHashMap.put(pair.c(), pair.d());
            }
            Pair pair2 = new Pair(databasePath2, file);
            if (linkedHashMap.isEmpty()) {
                mapO = kotlin.collections.x.o(pair2);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(pair2.c(), pair2.d());
                mapO = linkedHashMap2;
            }
            for (Map.Entry entry : mapO.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        androidx.work.k kVarC2 = androidx.work.k.c();
                        String[] strArr3 = B.f4138a;
                        file3.toString();
                        kVarC2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    androidx.work.k kVarC3 = androidx.work.k.c();
                    String[] strArr4 = B.f4138a;
                    kVarC3.getClass();
                }
            }
        }
    }
}
