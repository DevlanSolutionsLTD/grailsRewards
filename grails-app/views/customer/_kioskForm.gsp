<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <asset:image src="banner.png" alt="Rewards Logo"/>
        </div>
    </div>

    <div class="row">
        <div class="col-sm-5 col-sm-offset-1">
           <h4>${welcomeMessage}</h4>
            <p></p>
        </div>

        <div class="col-sm-6">
            <g:textField name="phone" class="form-control" placeholder="Enter Your Phone Number To Check In" value="${customerInstance?.phone}"/>
            <div class="row">
                <h4></h4>
            </div>

            <div class="row">
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="1" onclick="pad_key(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="2" onclick="pad_key(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="3" onclick="pad_key(this.value)"/>
                </div>
            </div>
            <div class="row">
                 <h4></h4>
            </div>
            <div class="row">
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="4" onclick="pad_key(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="5" onclick="pad_key(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="6" onclick="pad_key(this.value)"/>
                </div>
            </div>
            <div class="row">
                <h4></h4>
            </div>
            <div class="row">
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="7" onclick="pad_key(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="8" onclick="pad_key(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="9" onclick="pad_key(this.value)"/>
                </div>
            </div>
            <div class="row">
                <h4></h4>
            </div>
            <div class="row">
                <div class="col-sm-4">
                    <g:link class="btn btn-danger btn-lg btn-block" type="button" action="checkin" >Del</g:link>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="0" onclick="pad_key(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <g:submitButton  class="btn btn-success btn-lg btn-block"  name="pad" value="Go" />
                </div>
            </div>

        </div>
    </div>

</div>

<script>
    function pad_key(num)
    {
    //key pad text
    var txt=document.getElementById("phone").value;
    txt=txt + num;
    document.getElementById("phone").value=txt;
    }
</script>
