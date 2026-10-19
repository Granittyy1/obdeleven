package p126k0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: KeyFrames.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Constructor<? extends d>> f41265b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, ArrayList<d>> f41266a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> map = new HashMap<>();
        f41265b = map;
        try {
            map.put("KeyAttribute", e.class.getConstructor(null));
            map.put("KeyPosition", h.class.getConstructor(null));
            map.put("KeyCycle", f.class.getConstructor(null));
            map.put("KeyTimeCycle", j.class.getConstructor(null));
            map.put("KeyTrigger", k.class.getConstructor(null));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public g() {
    }

    public final void a(n nVar) {
        Integer numValueOf = Integer.valueOf(nVar.f41341c);
        HashMap<Integer, ArrayList<d>> map = this.f41266a;
        ArrayList<d> arrayList = map.get(numValueOf);
        if (arrayList != null) {
            nVar.f41360w.addAll(arrayList);
        }
        ArrayList<d> arrayList2 = map.get(-1);
        if (arrayList2 != null) {
            for (d dVar : arrayList2) {
                String str = ((ConstraintLayout.a) nVar.f41340b.getLayoutParams()).f16419Y;
                String str2 = dVar.f41229c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    nVar.f41360w.add(dVar);
                }
            }
        }
    }

    public final void b(d dVar) {
        Integer numValueOf = Integer.valueOf(dVar.f41228b);
        HashMap<Integer, ArrayList<d>> map = this.f41266a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(dVar.f41228b), new ArrayList<>());
        }
        ArrayList<d> arrayList = map.get(Integer.valueOf(dVar.f41228b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public g(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        byte b10;
        d eVar;
        try {
            int eventType = xmlResourceParser.getEventType();
            d dVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    if (f41265b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    b10 = -1;
                                } else {
                                    b10 = 3;
                                }
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case 540053991:
                                if (!name.equals("KeyCycle")) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 1153397896:
                                if (!name.equals("KeyPosition")) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            case 1308496505:
                                if (!name.equals("KeyTrigger")) {
                                    b10 = -1;
                                } else {
                                    b10 = 4;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            eVar = new e();
                        } else if (b10 == 1) {
                            eVar = new h();
                        } else if (b10 == 2) {
                            eVar = new f();
                        } else if (b10 == 3) {
                            eVar = new j();
                        } else if (b10 == 4) {
                            eVar = new k();
                        } else {
                            throw new NullPointerException("Key " + name + " not found");
                        }
                        eVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                        b(eVar);
                        dVar = eVar;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar != null && (map2 = dVar.f41230d) != null) {
                            ConstraintAttribute.d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar != null && (map = dVar.f41230d) != null) {
                        ConstraintAttribute.d(context, xmlResourceParser, map);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            Log.e("KeyFrames", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("KeyFrames", "Error parsing XML resource", e11);
        }
    }
}
