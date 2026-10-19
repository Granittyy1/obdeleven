package I4;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.Resources;
import android.media.metrics.PlaybackErrorEvent;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.compose.material.T;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.B;
import kotlin.text.Regex;
import p005a4.v;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3844d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f3842b = i10;
        this.f3843c = obj;
        this.f3844d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0266  */
    /* JADX WARN: Code duplicated, block: B:119:0x0268  */
    /* JADX WARN: Code duplicated, block: B:122:0x0273  */
    /* JADX WARN: Code duplicated, block: B:123:0x0275  */
    /* JADX WARN: Code duplicated, block: B:130:0x0281  */
    /* JADX WARN: Code duplicated, block: B:133:0x028e  */
    /* JADX WARN: Code duplicated, block: B:135:0x029f  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:157:0x0302  */
    /* JADX WARN: Code duplicated, block: B:159:0x030c  */
    /* JADX WARN: Code duplicated, block: B:160:0x030f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0323  */
    /* JADX WARN: Code duplicated, block: B:164:0x0327  */
    /* JADX WARN: Code duplicated, block: B:168:0x0339  */
    /* JADX WARN: Code duplicated, block: B:170:0x0341  */
    /* JADX WARN: Code duplicated, block: B:171:0x0347  */
    /* JADX WARN: Code duplicated, block: B:173:0x034d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0351  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375 A[LOOP:8: B:175:0x0352->B:180:0x0375, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x037d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0360 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        v vVar;
        Iterator it;
        String string;
        int length;
        int i10;
        int i11;
        String string2;
        String lowerCase;
        boolean zEquals;
        String str;
        String strH;
        String str2;
        int i12;
        Object[] array;
        String[] strArr;
        Set setZ;
        StringBuilder sb2;
        Iterator it2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 1;
        switch (this.f3842b) {
            case 0:
                int i18 = JobInfoSchedulerService.f25274b;
                ((JobInfoSchedulerService) this.f3843c).jobFinished((JobParameters) this.f3844d, false);
                return;
            case 1:
                View view = (View) this.f3843c;
                kotlin.jvm.internal.i.e(view, "$view");
                p017b4.d this$0 = (p017b4.d) this.f3844d;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (!(view instanceof EditText)) {
                    return;
                }
                String string3 = ((EditText) view).getText().toString();
                if (string3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string4 = kotlin.text.n.p0(string3).toString();
                if (string4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase2 = string4.toLowerCase();
                kotlin.jvm.internal.i.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (lowerCase2.length() == 0) {
                    return;
                }
                LinkedHashSet linkedHashSet = this$0.f20556b;
                if (linkedHashSet.contains(lowerCase2) || lowerCase2.length() > 100) {
                    return;
                }
                linkedHashSet.add(lowerCase2);
                HashMap map = new HashMap();
                ArrayList<String> arrayList = new ArrayList();
                arrayList.add(p043d4.c.g(view));
                Object tag = view.getTag();
                if (tag != null) {
                    arrayList.add(tag.toString());
                }
                CharSequence contentDescription = view.getContentDescription();
                if (contentDescription != null) {
                    arrayList.add(contentDescription.toString());
                }
                try {
                    if (view.getId() != -1) {
                        String resourceName = view.getResources().getResourceName(view.getId());
                        kotlin.jvm.internal.i.d(resourceName, "resourceName");
                        Object[] array2 = new Regex("/").h(resourceName, 0).toArray(new String[0]);
                        if (array2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        String[] strArr2 = (String[]) array2;
                        if (strArr2.length == 2) {
                            arrayList.add(strArr2[1]);
                        }
                    }
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        ConcurrentHashMap<String, String> concurrentHashMap = v.f8054f;
                        if (!zHasNext) {
                            String strB = p165n4.s.B(concurrentHashMap);
                            vVar.getClass();
                            Z3.q.c().execute(new K5.q(1, strB));
                            return;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        int length2 = str4.length() - i17;
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 <= length2) {
                            int i21 = kotlin.jvm.internal.i.g(str4.charAt(i20 == 0 ? i19 : length2), 32) <= 0 ? i17 : 0;
                            if (i20 == 0) {
                                if (i21 == 0) {
                                    i20 = i17;
                                } else {
                                    i19 += i17;
                                }
                            } else if (i21 == 0) {
                                string = str4.subSequence(i19, length2 + i17).toString();
                                vVar.getClass();
                                length = string.length() - i17;
                                i10 = 0;
                                i11 = 0;
                                while (i10 <= length) {
                                    if (i11 == 0) {
                                        i15 = i10;
                                    } else {
                                        i15 = length;
                                    }
                                    if (kotlin.jvm.internal.i.g(string.charAt(i15), 32) <= 0) {
                                        i16 = i17;
                                    } else {
                                        i16 = 0;
                                    }
                                    if (i11 == 0) {
                                        if (i16 == 0) {
                                            i11 = i17;
                                        } else {
                                            i10 += i17;
                                        }
                                    } else if (i16 == 0) {
                                        string2 = string.subSequence(i10, length + i17).toString();
                                        if (string2 != null) {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                        }
                                        lowerCase = string2.toLowerCase();
                                        kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                                        zEquals = "em".equals(str3);
                                        str = v.f8050b;
                                        if (zEquals) {
                                            if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                                                Log.e(str, "Setting email failure: this is not a valid email address");
                                                lowerCase = "";
                                            }
                                        } else if ("ph".equals(str3)) {
                                            lowerCase = new Regex("[^0-9]").f("", lowerCase);
                                        } else if ("ge".equals(str3)) {
                                            if (lowerCase.length() > 0) {
                                                lowerCase = lowerCase.substring(0, i17);
                                                kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            } else {
                                                lowerCase = "";
                                            }
                                            if (!"f".equals(lowerCase) && !"m".equals(lowerCase)) {
                                                Log.e(str, "Setting gender failure: the supported value for gender is f or m");
                                                lowerCase = "";
                                            }
                                        }
                                        strH = p165n4.s.H(lowerCase);
                                        if (concurrentHashMap.containsKey(str3)) {
                                            str2 = concurrentHashMap.get(str3);
                                            if (str2 == null) {
                                                strArr = null;
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                array = new Regex(",").h(str2, 0).toArray(new String[0]);
                                                if (array != null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                                }
                                                strArr = (String[]) array;
                                            }
                                            if (strArr == null) {
                                                strArr = new String[i12];
                                            }
                                            setZ = B.z(Arrays.copyOf(strArr, strArr.length));
                                            if (setZ.contains(strH)) {
                                                return;
                                            }
                                            sb2 = new StringBuilder();
                                            if (strArr.length == 0) {
                                                sb2.append(strH);
                                                it2 = it;
                                            } else {
                                                it2 = it;
                                                if (strArr.length < 5) {
                                                    B6.c.f(sb2, str2, ",", strH);
                                                } else {
                                                    i13 = 1;
                                                    while (true) {
                                                        i14 = i13 + 1;
                                                        sb2.append(strArr[i13]);
                                                        sb2.append(",");
                                                        if (i14 >= 5) {
                                                            sb2.append(strH);
                                                            setZ.remove(strArr[0]);
                                                        } else {
                                                            i13 = i14;
                                                        }
                                                    }
                                                }
                                            }
                                            concurrentHashMap.put(str3, sb2.toString());
                                            it = it2;
                                        } else {
                                            concurrentHashMap.put(str3, strH);
                                        }
                                        i17 = 1;
                                    } else {
                                        length -= i17;
                                    }
                                }
                                string2 = string.subSequence(i10, length + i17).toString();
                                if (string2 != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                lowerCase = string2.toLowerCase();
                                kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                                zEquals = "em".equals(str3);
                                str = v.f8050b;
                                if (zEquals) {
                                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                                        Log.e(str, "Setting email failure: this is not a valid email address");
                                        lowerCase = "";
                                    }
                                } else if ("ph".equals(str3)) {
                                    lowerCase = new Regex("[^0-9]").f("", lowerCase);
                                } else if ("ge".equals(str3)) {
                                    if (lowerCase.length() > 0) {
                                        lowerCase = lowerCase.substring(0, i17);
                                        kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    } else {
                                        lowerCase = "";
                                    }
                                    if (!"f".equals(lowerCase)) {
                                        Log.e(str, "Setting gender failure: the supported value for gender is f or m");
                                        lowerCase = "";
                                    }
                                }
                                strH = p165n4.s.H(lowerCase);
                                if (concurrentHashMap.containsKey(str3)) {
                                    str2 = concurrentHashMap.get(str3);
                                    if (str2 == null) {
                                        strArr = null;
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                        array = new Regex(",").h(str2, 0).toArray(new String[0]);
                                        if (array != null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                        strArr = (String[]) array;
                                    }
                                    if (strArr == null) {
                                        strArr = new String[i12];
                                    }
                                    setZ = B.z(Arrays.copyOf(strArr, strArr.length));
                                    if (setZ.contains(strH)) {
                                        return;
                                    }
                                    sb2 = new StringBuilder();
                                    if (strArr.length == 0) {
                                        sb2.append(strH);
                                        it2 = it;
                                    } else {
                                        it2 = it;
                                        if (strArr.length < 5) {
                                            B6.c.f(sb2, str2, ",", strH);
                                        } else {
                                            i13 = 1;
                                            while (true) {
                                                i14 = i13 + 1;
                                                sb2.append(strArr[i13]);
                                                sb2.append(",");
                                                if (i14 >= 5) {
                                                    sb2.append(strH);
                                                    setZ.remove(strArr[0]);
                                                } else {
                                                    i13 = i14;
                                                }
                                            }
                                        }
                                    }
                                    concurrentHashMap.put(str3, sb2.toString());
                                    it = it2;
                                } else {
                                    concurrentHashMap.put(str3, strH);
                                }
                                i17 = 1;
                            } else {
                                length2 -= i17;
                            }
                        }
                        string = str4.subSequence(i19, length2 + i17).toString();
                        vVar.getClass();
                        length = string.length() - i17;
                        i10 = 0;
                        i11 = 0;
                        while (i10 <= length) {
                            if (i11 == 0) {
                                i15 = i10;
                            } else {
                                i15 = length;
                            }
                            if (kotlin.jvm.internal.i.g(string.charAt(i15), 32) <= 0) {
                                i16 = i17;
                            } else {
                                i16 = 0;
                            }
                            if (i11 == 0) {
                                if (i16 == 0) {
                                    i11 = i17;
                                } else {
                                    i10 += i17;
                                }
                            } else if (i16 == 0) {
                                string2 = string.subSequence(i10, length + i17).toString();
                                if (string2 != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                lowerCase = string2.toLowerCase();
                                kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                                zEquals = "em".equals(str3);
                                str = v.f8050b;
                                if (zEquals) {
                                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                                        Log.e(str, "Setting email failure: this is not a valid email address");
                                        lowerCase = "";
                                    }
                                } else if ("ph".equals(str3)) {
                                    lowerCase = new Regex("[^0-9]").f("", lowerCase);
                                } else if ("ge".equals(str3)) {
                                    if (lowerCase.length() > 0) {
                                        lowerCase = lowerCase.substring(0, i17);
                                        kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    } else {
                                        lowerCase = "";
                                    }
                                    if (!"f".equals(lowerCase)) {
                                        Log.e(str, "Setting gender failure: the supported value for gender is f or m");
                                        lowerCase = "";
                                    }
                                }
                                strH = p165n4.s.H(lowerCase);
                                if (concurrentHashMap.containsKey(str3)) {
                                    str2 = concurrentHashMap.get(str3);
                                    if (str2 == null) {
                                        strArr = null;
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                        array = new Regex(",").h(str2, 0).toArray(new String[0]);
                                        if (array != null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                        strArr = (String[]) array;
                                    }
                                    if (strArr == null) {
                                        strArr = new String[i12];
                                    }
                                    setZ = B.z(Arrays.copyOf(strArr, strArr.length));
                                    if (setZ.contains(strH)) {
                                        return;
                                    }
                                    sb2 = new StringBuilder();
                                    if (strArr.length == 0) {
                                        sb2.append(strH);
                                        it2 = it;
                                    } else {
                                        it2 = it;
                                        if (strArr.length < 5) {
                                            B6.c.f(sb2, str2, ",", strH);
                                        } else {
                                            i13 = 1;
                                            while (true) {
                                                i14 = i13 + 1;
                                                sb2.append(strArr[i13]);
                                                sb2.append(",");
                                                if (i14 >= 5) {
                                                    sb2.append(strH);
                                                    setZ.remove(strArr[0]);
                                                } else {
                                                    i13 = i14;
                                                }
                                            }
                                        }
                                    }
                                    concurrentHashMap.put(str3, sb2.toString());
                                    it = it2;
                                } else {
                                    concurrentHashMap.put(str3, strH);
                                }
                                i17 = 1;
                            } else {
                                length -= i17;
                            }
                        }
                        string2 = string.subSequence(i10, length + i17).toString();
                        if (string2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        lowerCase = string2.toLowerCase();
                        kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                        zEquals = "em".equals(str3);
                        str = v.f8050b;
                        if (zEquals) {
                            if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                                Log.e(str, "Setting email failure: this is not a valid email address");
                                lowerCase = "";
                            }
                        } else if ("ph".equals(str3)) {
                            lowerCase = new Regex("[^0-9]").f("", lowerCase);
                        } else if ("ge".equals(str3)) {
                            if (lowerCase.length() > 0) {
                                lowerCase = lowerCase.substring(0, i17);
                                kotlin.jvm.internal.i.d(lowerCase, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            } else {
                                lowerCase = "";
                            }
                            if (!"f".equals(lowerCase)) {
                                Log.e(str, "Setting gender failure: the supported value for gender is f or m");
                                lowerCase = "";
                            }
                        }
                        strH = p165n4.s.H(lowerCase);
                        if (concurrentHashMap.containsKey(str3)) {
                            str2 = concurrentHashMap.get(str3);
                            if (str2 == null) {
                                strArr = null;
                                i12 = 0;
                            } else {
                                i12 = 0;
                                array = new Regex(",").h(str2, 0).toArray(new String[0]);
                                if (array != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                                strArr = (String[]) array;
                            }
                            if (strArr == null) {
                                strArr = new String[i12];
                            }
                            setZ = B.z(Arrays.copyOf(strArr, strArr.length));
                            if (setZ.contains(strH)) {
                                return;
                            }
                            sb2 = new StringBuilder();
                            if (strArr.length == 0) {
                                sb2.append(strH);
                                it2 = it;
                            } else {
                                it2 = it;
                                if (strArr.length < 5) {
                                    B6.c.f(sb2, str2, ",", strH);
                                } else {
                                    i13 = 1;
                                    while (true) {
                                        i14 = i13 + 1;
                                        sb2.append(strArr[i13]);
                                        sb2.append(",");
                                        if (i14 >= 5) {
                                            sb2.append(strH);
                                            setZ.remove(strArr[0]);
                                        } else {
                                            i13 = i14;
                                        }
                                    }
                                }
                            }
                            concurrentHashMap.put(str3, sb2.toString());
                            it = it2;
                        } else {
                            concurrentHashMap.put(str3, strH);
                        }
                        i17 = 1;
                    }
                } catch (Resources.NotFoundException unused) {
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str5 : arrayList) {
                    if (str5.length() > 0 && str5.length() <= 100) {
                        String lowerCase3 = str5.toLowerCase();
                        kotlin.jvm.internal.i.d(lowerCase3, "(this as java.lang.String).toLowerCase()");
                        arrayList2.add(lowerCase3);
                    }
                }
                CopyOnWriteArraySet copyOnWriteArraySet = p017b4.c.f20551d;
                ArrayList arrayList3 = null;
                for (p017b4.c cVar : new HashSet(p017b4.c.f20551d)) {
                    String strF = "r2".equals(cVar.f20552a) ? new Regex("[^\\d.]").f("", lowerCase2) : lowerCase2;
                    String str6 = cVar.f20553b;
                    if (str6.length() <= 0 || new Regex(str6).e(strF)) {
                        List<String> list = cVar.f20554c;
                        boolean zJ = T.j(arrayList2, new ArrayList(list));
                        HashMap map2 = p017b4.d.f20555f;
                        String str7 = cVar.f20552a;
                        if (zJ) {
                            b4.d.a.a(map, str7, strF);
                        } else {
                            if (arrayList3 == null) {
                                ArrayList arrayList4 = new ArrayList();
                                ViewParent parent = view.getParent();
                                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                if (viewGroup != null) {
                                    for (View view2 : p043d4.c.a(viewGroup)) {
                                        if (view != view2) {
                                            arrayList4.addAll(T.h(view2));
                                        }
                                    }
                                }
                                arrayList3 = arrayList4;
                            }
                            if (T.j(arrayList3, new ArrayList(list))) {
                                b4.d.a.a(map, str7, strF);
                            }
                        }
                    }
                }
                boolean z10 = v.f8052d.get();
                vVar = v.f8049a;
                if (!z10) {
                    vVar.a();
                }
                it = map.entrySet().iterator();
                break;
            case 2:
                androidx.constraintlayout.motion.widget.c cVar2 = (androidx.constraintlayout.motion.widget.c) this.f3843c;
                int i22 = cVar2.f16338p;
                View[] viewArr = (View[]) this.f3844d;
                if (i22 != -1) {
                    for (View view3 : viewArr) {
                        view3.setTag(cVar2.f16338p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (cVar2.f16339q != -1) {
                    for (View view4 : viewArr) {
                        view4.setTag(cVar2.f16339q, null);
                    }
                    return;
                }
                return;
            case 3:
                ((p162n1.t) this.f3843c).f44720d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f3844d);
                return;
            default:
                p218r7.u uVar = (p218r7.u) this.f3843c;
                Context context = (Context) this.f3844d;
                if (uVar.f46386a != null || context == null) {
                    return;
                }
                uVar.f46386a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
        }
    }
}
