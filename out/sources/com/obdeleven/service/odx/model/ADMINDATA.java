package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"LANGUAGE", "COMPANY-DOC-INFOS", "DOC-REVISIONS"})
@Root(name = "ADMIN-DATA")
public class ADMINDATA {

    @Element(name = "COMPANY-DOC-INFOS")
    protected COMPANYDOCINFOS companydocinfos;

    @Element(name = "DOC-REVISIONS")
    protected DOCREVISIONS docrevisions;

    @Element(name = "LANGUAGE")
    @Convert(CollapsedStringConverter.class)
    protected String language;

    public COMPANYDOCINFOS getCOMPANYDOCINFOS() {
        return this.companydocinfos;
    }

    public DOCREVISIONS getDOCREVISIONS() {
        return this.docrevisions;
    }

    public String getLANGUAGE() {
        return this.language;
    }

    public void setCOMPANYDOCINFOS(COMPANYDOCINFOS companydocinfos) {
        this.companydocinfos = companydocinfos;
    }

    public void setDOCREVISIONS(DOCREVISIONS docrevisions) {
        this.docrevisions = docrevisions;
    }

    public void setLANGUAGE(String str) {
        this.language = str;
    }
}
