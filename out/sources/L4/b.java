package L4;

import C4.v;
import Ia.l;
import Oa.c;
import Y2.e;
import android.database.Cursor;
import android.graphics.Matrix;
import androidx.activity.B;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.q;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.i;
import kotlinx.serialization.SerializationException;
import p005a4.o;
import p141l2.C2746p;
import p141l2.C2748s;
import p141l2.L;
import p141l2.r;

/* JADX INFO: compiled from: WallTimeClock.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a, e {
    public static void c(OnBackPressedDispatcher onBackPressedDispatcher, q qVar, l lVar) {
        i.e(onBackPressedDispatcher, "<this>");
        onBackPressedDispatcher.a(qVar, new B(lVar, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object d(AbstractCollection abstractCollection) {
        Object next;
        if (abstractCollection instanceof List) {
            List list = (List) abstractCollection;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return v.e(1, list);
        }
        Iterator it = abstractCollection.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final C2746p e(l builder, String str) {
        i.e(builder, "builder");
        C2748s c2748s = new C2748s();
        builder.invoke(c2748s);
        r.a aVar = c2748s.f44296a;
        L<Object> lB = aVar.f44292a;
        if (lB == null) {
            L.b bVar = L.Companion;
            Object obj = aVar.f44294c;
            bVar.getClass();
            lB = L.b.b(obj);
        }
        return new C2746p(str, new r(lB, aVar.f44293b, aVar.f44294c, aVar.f44295d));
    }

    public static final List f(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(TicketDetailDestinationKt.LAUNCHED_FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        ListBuilder listBuilderF = M1.f();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            i.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            i.d(string2, "cursor.getString(toColumnIndex)");
            listBuilderF.add(new t2.a.c(i10, i11, string, string2));
        }
        return kotlin.collections.q.g0(listBuilderF.I());
    }

    public static final t2.a.d g(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str, boolean z10) throws IOException {
        Cursor cursorC = frameworkSQLiteDatabase.c("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorC.getColumnIndex("seqno");
            int columnIndex2 = cursorC.getColumnIndex(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            int columnIndex3 = cursorC.getColumnIndex("name");
            int columnIndex4 = cursorC.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorC.moveToNext()) {
                    if (cursorC.getInt(columnIndex2) >= 0) {
                        int i10 = cursorC.getInt(columnIndex);
                        String columnName = cursorC.getString(columnIndex3);
                        String str2 = cursorC.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        i.d(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                i.d(collectionValues, "columnsMap.values");
                List listO0 = kotlin.collections.q.o0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                i.d(collectionValues2, "ordersMap.values");
                t2.a.d dVar = new t2.a.d(str, z10, listO0, kotlin.collections.q.o0(collectionValues2));
                p241t7.b.n(cursorC, null);
                return dVar;
            }
            p241t7.b.n(cursorC, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p241t7.b.n(cursorC, th);
                throw th2;
            }
        }
    }

    public static final void h(float[] fArr, Matrix matrix) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void i(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static void j(List list, com.google.common.base.e eVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (eVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static final void k(c baseClass, String str) {
        String string;
        i.e(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.a() + '\'';
        if (str == null) {
            string = o.c('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbC = B6.a.c("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            sbC.append(str);
            sbC.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sbC.append(str);
            sbC.append("' has to be '@Serializable', and the base class '");
            sbC.append(baseClass.a());
            sbC.append("' has to be sealed and '@Serializable'.");
            string = sbC.toString();
        }
        throw new SerializationException(string);
    }

    public static final int l(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    @Override // Y2.e
    public boolean a() {
        return true;
    }

    @Override // L4.a
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // Y2.e
    public void shutdown() {
    }
}
