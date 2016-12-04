package com.example.pragyaagrawal.antsquaretask.models;

import java.util.List;

/**
 * This is the data model of the details of the business/user
 */

public class ProductDataModel {

    private String total;

    private List<Resources> resources;

    private String per_page;

    private String page;

    private String has_more;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public List<Resources> getResources ()
    {
        return resources;
    }

    public void setResources (List<Resources> resources)
    {
        this.resources = resources;
    }

    public String getPer_page ()
    {
        return per_page;
    }

    public void setPer_page (String per_page)
    {
        this.per_page = per_page;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getHas_more ()
    {
        return has_more;
    }

    public void setHas_more (String has_more)
    {
        this.has_more = has_more;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", resources = "+resources+", per_page = "+per_page+", page = "+page+", has_more = "+has_more+"]";
    }
}
