package com.parse;

import android.os.Parcel;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
interface ParseFieldOperation {
    Object apply(Object obj, String str);

    Object encode(ParseEncoder parseEncoder) throws JSONException;

    void encode(Parcel parcel, ParseParcelEncoder parseParcelEncoder);

    ParseFieldOperation mergeWithPrevious(ParseFieldOperation parseFieldOperation);
}
