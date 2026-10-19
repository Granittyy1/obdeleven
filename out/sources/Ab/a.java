package Ab;

import io.intercom.android.sdk.models.AttributeType;
import java.util.Hashtable;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: Factory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f1044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f1045c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f1046a;

    static {
        Hashtable hashtable = new Hashtable();
        f1044b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put(AttributeType.FLOAT, Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f1045c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f1046a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f1044b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return ClassNotFoundException.class;
        }
    }

    public static b b(org.aspectj.lang.a aVar, Object obj, Object obj2) {
        return new b(aVar, obj, obj2, f1045c);
    }

    public static b c(org.aspectj.lang.a aVar, Object obj, Object obj2, Object obj3) {
        return new b(aVar, obj, obj2, new Object[]{obj3});
    }

    public final c d(String str, String str2, String str3, String str4, String str5) {
        ClassLoader classLoader = this.f1046a;
        Class clsA = a(classLoader, str2);
        int i10 = Integer.parseInt("1", 16);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i11 = 0; i11 < iCountTokens; i11++) {
            clsArr[i11] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i12 = 0; i12 < iCountTokens2; i12++) {
            strArr[i12] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i13 = 0; i13 < iCountTokens3; i13++) {
            clsArr2[i13] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class clsA2 = a(classLoader, str5);
        c cVar = new c();
        cVar.f1057a = i10;
        cVar.f1058b = str;
        cVar.f1060d = clsA;
        cVar.f1053g = clsArr;
        cVar.f1054h = clsArr2;
        cVar.f1055i = clsA2;
        return cVar;
    }

    public final b.a e(c cVar) {
        b.a aVar = new b.a();
        aVar.f1051a = "method-execution";
        aVar.f1052b = cVar;
        return aVar;
    }
}
