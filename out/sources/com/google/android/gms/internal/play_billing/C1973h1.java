package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1973h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f26185a;

    static {
        char[] cArr = new char[80];
        f26185a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            zzei zzeiVar = zzei.f26345b;
            sb2.append(A0.f.m(new zzeg(((String) obj).getBytes(O0.f26148a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzei) {
            sb2.append(": \"");
            sb2.append(A0.f.m((zzei) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof I0) {
            sb2.append(" {");
            c((I0) obj, sb2, i10 + 2);
            sb2.append("\n");
            b(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb2, i12, "key", entry.getKey());
        a(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        b(i10, sb2);
        sb2.append("}");
    }

    public static void b(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f26185a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    public static void c(I0 i10, StringBuilder sb2, int i11) {
        int i12;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = i10.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i12 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i12);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb2, i11, strSubstring.substring(0, strSubstring.length() - 4), I0.k(method2, i10, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i11, strSubstring.substring(0, strSubstring.length() - 3), I0.k(method, i10, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objK = I0.k(method4, i10, new Object[0]);
                    if (method5 == null) {
                        if (objK instanceof Boolean) {
                            if (((Boolean) objK).booleanValue()) {
                                a(sb2, i11, strSubstring, objK);
                            }
                        } else if (objK instanceof Integer) {
                            if (((Integer) objK).intValue() != 0) {
                                a(sb2, i11, strSubstring, objK);
                            }
                        } else if (objK instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objK).floatValue()) != 0) {
                                a(sb2, i11, strSubstring, objK);
                            }
                        } else if (!(objK instanceof Double)) {
                            if (objK instanceof String) {
                                zEquals = objK.equals("");
                            } else if (objK instanceof zzei) {
                                zEquals = objK.equals(zzei.f26345b);
                            } else if (objK instanceof InterfaceC1967f1) {
                                if (objK != ((InterfaceC1967f1) objK).B()) {
                                    a(sb2, i11, strSubstring, objK);
                                }
                            } else if (!(objK instanceof Enum) || ((Enum) objK).ordinal() != 0) {
                                a(sb2, i11, strSubstring, objK);
                            }
                            if (!zEquals) {
                                a(sb2, i11, strSubstring, objK);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) != 0) {
                            a(sb2, i11, strSubstring, objK);
                        }
                    } else if (((Boolean) I0.k(method5, i10, new Object[0])).booleanValue()) {
                        a(sb2, i11, strSubstring, objK);
                    }
                }
            }
            i12 = 3;
        }
        if (i10 instanceof F0) {
            Iterator itB = ((F0) i10).zzb.b();
            if (itB.hasNext()) {
                throw null;
            }
        }
        C2020x1 c2020x1 = i10.zzc;
        if (c2020x1 != null) {
            for (int i14 = 0; i14 < c2020x1.f26299a; i14++) {
                a(sb2, i11, String.valueOf(c2020x1.f26300b[i14] >>> 3), c2020x1.f26301c[i14]);
            }
        }
    }
}
