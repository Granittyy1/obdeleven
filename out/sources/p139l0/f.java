package p139l0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: StateSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f44149b = new SparseArray<>();

    /* JADX INFO: compiled from: StateSet.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f44151b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44152c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f44152c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f44140s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f44150a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44150a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44152c);
                    this.f44152c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: StateSet.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f44153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f44154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f44155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f44156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44157e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f44153a = Float.NaN;
            this.f44154b = Float.NaN;
            this.f44155c = Float.NaN;
            this.f44156d = Float.NaN;
            this.f44157e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f44144w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44157e);
                    this.f44157e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f44156d = typedArrayObtainStyledAttributes.getDimension(index, this.f44156d);
                } else if (index == 2) {
                    this.f44154b = typedArrayObtainStyledAttributes.getDimension(index, this.f44154b);
                } else if (index == 3) {
                    this.f44155c = typedArrayObtainStyledAttributes.getDimension(index, this.f44155c);
                } else if (index == 4) {
                    this.f44153a = typedArrayObtainStyledAttributes.getDimension(index, this.f44153a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            float f12 = this.f44153a;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f44154b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.f44155c;
            if (!Float.isNaN(f14) && f10 > f14) {
                return false;
            }
            float f15 = this.f44156d;
            return Float.isNaN(f15) || f11 <= f15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f44148a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f44141t);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f44148a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44148a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b10 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 2) {
                        aVar = new a(context, xmlResourceParser);
                        this.f44149b.put(aVar.f44150a, aVar);
                    } else if (b10 == 3) {
                        b bVar = new b(context, xmlResourceParser);
                        if (aVar != null) {
                            aVar.f44151b.add(bVar);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        }
    }

    public final int a(int i10) {
        int i11;
        float f10 = -1;
        SparseArray<a> sparseArray = this.f44149b;
        int i12 = 0;
        if (-1 == i10) {
            a aVarValueAt = i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1);
            if (aVarValueAt == null) {
                return -1;
            }
            while (true) {
                ArrayList<b> arrayList = aVarValueAt.f44151b;
                if (i12 >= arrayList.size()) {
                    i12 = -1;
                    break;
                }
                if (arrayList.get(i12).a(f10, f10)) {
                    break;
                }
                i12++;
            }
            if (-1 == i12) {
                return -1;
            }
            i11 = i12 == -1 ? aVarValueAt.f44152c : aVarValueAt.f44151b.get(i12).f44157e;
        } else {
            a aVar = sparseArray.get(i10);
            if (aVar == null) {
                return -1;
            }
            while (true) {
                ArrayList<b> arrayList2 = aVar.f44151b;
                if (i12 >= arrayList2.size()) {
                    i12 = -1;
                    break;
                }
                if (arrayList2.get(i12).a(f10, f10)) {
                    break;
                }
                i12++;
            }
            i11 = i12 == -1 ? aVar.f44152c : aVar.f44151b.get(i12).f44157e;
        }
        return i11;
    }
}
