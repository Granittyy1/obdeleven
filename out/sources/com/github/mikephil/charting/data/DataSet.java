package com.github.mikephil.charting.data;

import C4.v;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class DataSet<T extends Entry> extends BaseDataSet<T> {
    protected List<T> mValues;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mValues = list;
        if (list == null) {
            this.mValues = new ArrayList();
        }
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean addEntry(T t8) {
        if (t8 == null) {
            return false;
        }
        List<T> values = getValues();
        if (values == null) {
            values = new ArrayList<>();
        }
        calcMinMax(t8);
        return values.add(t8);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void addEntryOrdered(T t8) {
        if (t8 == null) {
            return;
        }
        if (this.mValues == null) {
            this.mValues = new ArrayList();
        }
        calcMinMax(t8);
        if (this.mValues.size() <= 0 || ((Entry) v.e(1, this.mValues)).getX() <= t8.getX()) {
            this.mValues.add(t8);
        } else {
            this.mValues.add(getEntryIndex(t8.getX(), t8.getY(), Rounding.UP), t8);
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMax() {
        List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        Iterator<T> it = this.mValues.iterator();
        while (it.hasNext()) {
            calcMinMax(it.next());
        }
    }

    public void calcMinMaxX(T t8) {
        if (t8.getX() < this.mXMin) {
            this.mXMin = t8.getX();
        }
        if (t8.getX() > this.mXMax) {
            this.mXMax = t8.getX();
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMaxY(float f10, float f11) {
        List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        int entryIndex = getEntryIndex(f11, Float.NaN, Rounding.UP);
        for (int entryIndex2 = getEntryIndex(f10, Float.NaN, Rounding.DOWN); entryIndex2 <= entryIndex; entryIndex2++) {
            calcMinMaxY(this.mValues.get(entryIndex2));
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void clear() {
        this.mValues.clear();
        notifyDataSetChanged();
    }

    public abstract DataSet<T> copy();

    public void copy(DataSet dataSet) {
        super.copy((BaseDataSet) dataSet);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<T> getEntriesForXValue(float f10) {
        ArrayList arrayList = new ArrayList();
        int size = this.mValues.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (size + i10) / 2;
            T t8 = this.mValues.get(i11);
            if (f10 == t8.getX()) {
                while (i11 > 0 && this.mValues.get(i11 - 1).getX() == f10) {
                    i11--;
                }
                int size2 = this.mValues.size();
                while (i11 < size2) {
                    T t10 = this.mValues.get(i11);
                    if (t10.getX() != f10) {
                        break;
                    }
                    arrayList.add(t10);
                    i11++;
                }
                break;
            }
            if (f10 > t8.getX()) {
                i10 = i11 + 1;
            } else {
                size = i11 - 1;
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryCount() {
        return this.mValues.size();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForIndex(int i10) {
        return this.mValues.get(i10);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForXValue(float f10, float f11, Rounding rounding) {
        int entryIndex = getEntryIndex(f10, f11, rounding);
        if (entryIndex > -1) {
            return this.mValues.get(entryIndex);
        }
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(Entry entry) {
        return this.mValues.indexOf(entry);
    }

    public List<T> getValues() {
        return this.mValues;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getXMax() {
        return this.mXMax;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getXMin() {
        return this.mXMin;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMax() {
        return this.mYMax;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMin() {
        return this.mYMin;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntry(T t8) {
        List<T> list;
        if (t8 == null || (list = this.mValues) == null) {
            return false;
        }
        boolean zRemove = list.remove(t8);
        if (zRemove) {
            calcMinMax();
        }
        return zRemove;
    }

    public void setValues(List<T> list) {
        this.mValues = list;
        notifyDataSetChanged();
    }

    public String toSimpleString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb2 = new StringBuilder("DataSet, label: ");
        sb2.append(getLabel() == null ? "" : getLabel());
        sb2.append(", entries: ");
        sb2.append(this.mValues.size());
        sb2.append("\n");
        stringBuffer.append(sb2.toString());
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(toSimpleString());
        for (int i10 = 0; i10 < this.mValues.size(); i10++) {
            stringBuffer.append(this.mValues.get(i10).toString() + " ");
        }
        return stringBuffer.toString();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(float f10, float f11, Rounding rounding) {
        int i10;
        T t8;
        List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.mValues.size() - 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = (i11 + size) / 2;
            float x10 = this.mValues.get(i12).getX() - f10;
            int i13 = i12 + 1;
            float x11 = this.mValues.get(i13).getX() - f10;
            float fAbs = Math.abs(x10);
            float fAbs2 = Math.abs(x11);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d10 = x10;
                    if (d10 < 0.0d) {
                        if (d10 < 0.0d) {
                        }
                    }
                }
                size = i12;
            }
            i11 = i13;
        }
        if (size == -1) {
            return size;
        }
        float x12 = this.mValues.get(size).getX();
        if (rounding == Rounding.UP) {
            if (x12 < f10 && size < this.mValues.size() - 1) {
                size++;
            }
        } else if (rounding == Rounding.DOWN && x12 > f10 && size > 0) {
            size--;
        }
        if (Float.isNaN(f11)) {
            return size;
        }
        while (size > 0 && this.mValues.get(size - 1).getX() == x12) {
            size--;
        }
        float y10 = this.mValues.get(size).getY();
        loop2: while (true) {
            i10 = size;
            do {
                size++;
                if (size >= this.mValues.size()) {
                    break loop2;
                }
                t8 = this.mValues.get(size);
                if (t8.getX() != x12) {
                    break loop2;
                }
            } while (Math.abs(t8.getY() - f11) >= Math.abs(y10 - f11));
            y10 = f11;
        }
        return i10;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForXValue(float f10, float f11) {
        return (T) getEntryForXValue(f10, f11, Rounding.CLOSEST);
    }

    public void calcMinMaxY(T t8) {
        if (t8.getY() < this.mYMin) {
            this.mYMin = t8.getY();
        }
        if (t8.getY() > this.mYMax) {
            this.mYMax = t8.getY();
        }
    }

    public void calcMinMax(T t8) {
        if (t8 == null) {
            return;
        }
        calcMinMaxX(t8);
        calcMinMaxY(t8);
    }
}
