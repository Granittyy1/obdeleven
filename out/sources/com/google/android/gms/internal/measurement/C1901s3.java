package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1901s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f25842a;

    static {
        char[] cArr = new char[80];
        f25842a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f25842a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:103:0x0204  */
    /* JADX WARN: Code duplicated, block: B:131:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x015b  */
    /* JADX WARN: Code duplicated, block: B:59:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0175  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x0186  */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    /* JADX WARN: Code duplicated, block: B:69:0x018d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
    public static void b(N2 n10, StringBuilder sb2, int i10) {
        int i11;
        Method method;
        Method method2;
        Object objO;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = n10.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method5 = declaredMethods[i12];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                c(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), N2.o(method4, n10, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                c(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), N2.o(method3, n10, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objO = N2.o(method, n10, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objO instanceof Boolean) {
                                    if (((Boolean) objO).booleanValue()) {
                                        zEquals = false;
                                    } else {
                                        zEquals = true;
                                    }
                                } else if (objO instanceof Integer) {
                                    if (((Integer) objO).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objO instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objO).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objO instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objO).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objO instanceof String) {
                                    zEquals = objO.equals("");
                                } else if (objO instanceof zzij) {
                                    zEquals = objO.equals(zzij.f26049b);
                                } else if ((objO instanceof InterfaceC1894r3) ? !((objO instanceof Enum) && ((Enum) objO).ordinal() == 0) : objO != ((InterfaceC1894r3) objO).e()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) N2.o(method2, n10, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                c(sb2, i10, strSubstring, objO);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objO = N2.o(method, n10, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objO instanceof Boolean) {
                                if (((Boolean) objO).booleanValue()) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objO instanceof Integer) {
                                if (((Integer) objO).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objO instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objO).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objO instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objO).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objO instanceof String) {
                                zEquals = objO.equals("");
                            } else if (objO instanceof zzij) {
                                zEquals = objO.equals(zzij.f26049b);
                            } else if (objO instanceof InterfaceC1894r3) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) N2.o(method2, n10, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            c(sb2, i10, strSubstring, objO);
                        }
                    }
                }
            }
            i11 = 3;
        }
        if (n10 instanceof N2.b) {
            Iterator<Map.Entry<T, Object>> itE = ((N2.b) n10).zzc.e();
            if (itE.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        S3 s10 = n10.zzb;
        if (s10 != null) {
            for (int i13 = 0; i13 < s10.f25588a; i13++) {
                c(sb2, i10, String.valueOf(s10.f25589b[i13] >>> 3), s10.f25590c[i13]);
            }
        }
    }

    public static void c(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
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
            zzij zzijVar = zzij.f26049b;
            sb2.append(Y.o(new zzit(((String) obj).getBytes(Q2.f25563a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzij) {
            sb2.append(": \"");
            sb2.append(Y.o((zzij) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof N2) {
            sb2.append(" {");
            b((N2) obj, sb2, i10 + 2);
            sb2.append("\n");
            a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        c(sb2, i12, "key", entry.getKey());
        c(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        a(i10, sb2);
        sb2.append("}");
    }
}
