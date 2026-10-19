package p236t2;

import android.database.Cursor;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;
import p005a4.p;

/* JADX INFO: compiled from: TableInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractSet f47107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractSet f47108d;

    /* JADX INFO: renamed from: t2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TableInfo.kt */
    public static final class C0533a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f47111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f47112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f47113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f47114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f47115g;

        /* JADX INFO: renamed from: t2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TableInfo.kt */
        public static final class C0534a {
            public static boolean a(String current, String str) {
                i.e(current, "current");
                if (current.equals(str)) {
                    return true;
                }
                if (current.length() != 0) {
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (i10 < current.length()) {
                        char cCharAt = current.charAt(i10);
                        int i13 = i12 + 1;
                        if (i12 != 0 || cCharAt == '(') {
                            if (cCharAt == '(') {
                                i11++;
                            } else if (cCharAt != ')' || (i11 = i11 - 1) != 0 || i12 == current.length() - 1) {
                            }
                            i10++;
                            i12 = i13;
                        }
                    }
                    if (i11 == 0) {
                        String strSubstring = current.substring(1, current.length() - 1);
                        i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return i.a(n.p0(strSubstring).toString(), str);
                    }
                }
                return false;
            }
        }

        public C0533a(int i10, int i11, String str, String str2, String str3, boolean z10) {
            this.f47109a = str;
            this.f47110b = str2;
            this.f47111c = z10;
            this.f47112d = i10;
            this.f47113e = str3;
            this.f47114f = i11;
            Locale US = Locale.US;
            i.d(US, "US");
            String upperCase = str2.toUpperCase(US);
            i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            this.f47115g = n.J(upperCase, "INT", false) ? 3 : (n.J(upperCase, "CHAR", false) || n.J(upperCase, "CLOB", false) || n.J(upperCase, "TEXT", false)) ? 2 : n.J(upperCase, "BLOB", false) ? 5 : (n.J(upperCase, "REAL", false) || n.J(upperCase, "FLOA", false) || n.J(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0533a)) {
                return false;
            }
            C0533a c0533a = (C0533a) obj;
            if (this.f47112d != c0533a.f47112d) {
                return false;
            }
            if (!this.f47109a.equals(c0533a.f47109a) || this.f47111c != c0533a.f47111c) {
                return false;
            }
            int i10 = c0533a.f47114f;
            String str = c0533a.f47113e;
            String str2 = this.f47113e;
            int i11 = this.f47114f;
            if (i11 == 1 && i10 == 2 && str2 != null && !C0534a.a(str2, str)) {
                return false;
            }
            if (i11 != 2 || i10 != 1 || str == null || C0534a.a(str, str2)) {
                return (i11 == 0 || i11 != i10 || (str2 == null ? str == null : C0534a.a(str2, str))) && this.f47115g == c0533a.f47115g;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f47109a.hashCode() * 31) + this.f47115g) * 31) + (this.f47111c ? 1231 : 1237)) * 31) + this.f47112d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.f47109a);
            sb2.append("', type='");
            sb2.append(this.f47110b);
            sb2.append("', affinity='");
            sb2.append(this.f47115g);
            sb2.append("', notNull=");
            sb2.append(this.f47111c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f47112d);
            sb2.append(", defaultValue='");
            String str = this.f47113e;
            if (str == null) {
                str = "undefined";
            }
            return Q8.d.a(sb2, str, "'}");
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f47118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f47119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f47120e;

        public b(String str, String str2, String str3, List<String> columnNames, List<String> referenceColumnNames) {
            i.e(columnNames, "columnNames");
            i.e(referenceColumnNames, "referenceColumnNames");
            this.f47116a = str;
            this.f47117b = str2;
            this.f47118c = str3;
            this.f47119d = columnNames;
            this.f47120e = referenceColumnNames;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (i.a(this.f47116a, bVar.f47116a) && i.a(this.f47117b, bVar.f47117b) && i.a(this.f47118c, bVar.f47118c) && i.a(this.f47119d, bVar.f47119d)) {
                return i.a(this.f47120e, bVar.f47120e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f47120e.hashCode() + p.d(B1.a.b(this.f47118c, B1.a.b(this.f47117b, this.f47116a.hashCode() * 31, 31), 31), 31, this.f47119d);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ForeignKey{referenceTable='");
            sb2.append(this.f47116a);
            sb2.append("', onDelete='");
            sb2.append(this.f47117b);
            sb2.append(" +', onUpdate='");
            sb2.append(this.f47118c);
            sb2.append("', columnNames=");
            sb2.append(this.f47119d);
            sb2.append(", referenceColumnNames=");
            return Q8.d.b(sb2, this.f47120e, '}');
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f47123d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f47124e;

        public c(int i10, int i11, String str, String str2) {
            this.f47121b = i10;
            this.f47122c = i11;
            this.f47123d = str;
            this.f47124e = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c other = cVar;
            i.e(other, "other");
            int i10 = this.f47121b - other.f47121b;
            return i10 == 0 ? this.f47122c - other.f47122c : i10;
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f47126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f47127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f47128d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public d(String str, boolean z10, List<String> columns, List<String> orders) {
            i.e(columns, "columns");
            i.e(orders, "orders");
            this.f47125a = str;
            this.f47126b = z10;
            this.f47127c = columns;
            this.f47128d = orders;
            List<String> arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add("ASC");
                }
            }
            this.f47128d = (List) arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f47126b != dVar.f47126b || !i.a(this.f47127c, dVar.f47127c) || !i.a(this.f47128d, dVar.f47128d)) {
                return false;
            }
            String str = this.f47125a;
            boolean zI = m.I(str, "index_", false);
            String str2 = dVar.f47125a;
            return zI ? m.I(str2, "index_", false) : str.equals(str2);
        }

        public final int hashCode() {
            String str = this.f47125a;
            return this.f47128d.hashCode() + p.d((((m.I(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f47126b ? 1 : 0)) * 31, 31, this.f47127c);
        }

        public final String toString() {
            return "Index{name='" + this.f47125a + "', unique=" + this.f47126b + ", columns=" + this.f47127c + ", orders=" + this.f47128d + "'}";
        }
    }

    public a(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        i.e(foreignKeys, "foreignKeys");
        this.f47105a = str;
        this.f47106b = map;
        this.f47107c = foreignKeys;
        this.f47108d = abstractSet;
    }

    public static final a a(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str) {
        Map mapK;
        SetBuilder setBuilderK;
        SetBuilder setBuilder;
        Cursor cursorC = frameworkSQLiteDatabase.c("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorC.getColumnCount() <= 0) {
                mapK = y.p();
                p241t7.b.n(cursorC, null);
            } else {
                int columnIndex = cursorC.getColumnIndex("name");
                int columnIndex2 = cursorC.getColumnIndex("type");
                int columnIndex3 = cursorC.getColumnIndex("notnull");
                int columnIndex4 = cursorC.getColumnIndex("pk");
                int columnIndex5 = cursorC.getColumnIndex("dflt_value");
                MapBuilder mapBuilder = new MapBuilder();
                while (cursorC.moveToNext()) {
                    String name = cursorC.getString(columnIndex);
                    String type = cursorC.getString(columnIndex2);
                    boolean z10 = cursorC.getInt(columnIndex3) != 0;
                    int i10 = cursorC.getInt(columnIndex4);
                    String string = cursorC.getString(columnIndex5);
                    i.d(name, "name");
                    i.d(type, "type");
                    mapBuilder.put(name, new C0533a(i10, 2, name, type, string, z10));
                }
                mapK = mapBuilder.k();
                p241t7.b.n(cursorC, null);
            }
            Cursor cursorC2 = frameworkSQLiteDatabase.c("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorC2.getColumnIndex("id");
                int columnIndex7 = cursorC2.getColumnIndex("seq");
                int columnIndex8 = cursorC2.getColumnIndex("table");
                int columnIndex9 = cursorC2.getColumnIndex("on_delete");
                int columnIndex10 = cursorC2.getColumnIndex("on_update");
                List listF = L4.b.f(cursorC2);
                cursorC2.moveToPosition(-1);
                SetBuilder setBuilder2 = new SetBuilder();
                while (cursorC2.moveToNext()) {
                    if (cursorC2.getInt(columnIndex7) == 0) {
                        int i11 = cursorC2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = columnIndex6;
                        ArrayList<c> arrayList3 = new ArrayList();
                        for (Object obj : listF) {
                            int i13 = columnIndex7;
                            List list = listF;
                            if (((c) obj).f47121b == i11) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i13;
                            listF = list;
                        }
                        int i14 = columnIndex7;
                        List list2 = listF;
                        for (c cVar : arrayList3) {
                            arrayList.add(cVar.f47123d);
                            arrayList2.add(cVar.f47124e);
                        }
                        String string2 = cursorC2.getString(columnIndex8);
                        i.d(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = cursorC2.getString(columnIndex9);
                        i.d(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = cursorC2.getString(columnIndex10);
                        i.d(string4, "cursor.getString(onUpdateColumnIndex)");
                        setBuilder2.add(new b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i12;
                        columnIndex7 = i14;
                        listF = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                SetBuilder setBuilderK2 = setBuilder2.k();
                p241t7.b.n(cursorC2, null);
                Cursor cursorC3 = frameworkSQLiteDatabase.c("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorC3.getColumnIndex("name");
                    int columnIndex12 = cursorC3.getColumnIndex("origin");
                    int columnIndex13 = cursorC3.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        setBuilderK = null;
                        p241t7.b.n(cursorC3, null);
                    } else {
                        SetBuilder setBuilder3 = new SetBuilder();
                        while (cursorC3.moveToNext()) {
                            if ("c".equals(cursorC3.getString(columnIndex12))) {
                                String name2 = cursorC3.getString(columnIndex11);
                                boolean z11 = cursorC3.getInt(columnIndex13) == 1;
                                i.d(name2, "name");
                                d dVarG = L4.b.g(frameworkSQLiteDatabase, name2, z11);
                                if (dVarG == null) {
                                    p241t7.b.n(cursorC3, null);
                                    setBuilder = null;
                                    return new a(str, mapK, setBuilderK2, setBuilder);
                                }
                                setBuilder3.add(dVarG);
                            }
                        }
                        setBuilderK = setBuilder3.k();
                        p241t7.b.n(cursorC3, null);
                    }
                    setBuilder = setBuilderK;
                    return new a(str, mapK, setBuilderK2, setBuilder);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p241t7.b.n(cursorC3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    p241t7.b.n(cursorC2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                p241t7.b.n(cursorC, th5);
                throw th6;
            }
        }
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f47105a.equals(aVar.f47105a) || !this.f47106b.equals(aVar.f47106b) || !i.a(this.f47107c, aVar.f47107c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f47108d;
        if (abstractSet2 == null || (abstractSet = aVar.f47108d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f47107c.hashCode() + ((this.f47106b.hashCode() + (this.f47105a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f47105a + "', columns=" + this.f47106b + ", foreignKeys=" + this.f47107c + ", indices=" + this.f47108d + '}';
    }
}
