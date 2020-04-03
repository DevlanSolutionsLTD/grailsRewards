<!-- This should be empty -->
<div class="fieldcontain">
    %{--@declare id="firstname"--}%<label for="firstName">
        First Name
    </label>
    <g:textField name="firstName" />

</div>

<div class="fieldcontain">
%{--@declare id="comments"--}%<label for="comments">
    Comment
</label>
    <g:textArea name="comments" />

</div>

<div class="fieldcontain">
%{--@declare id="password"--}%<label for="password">
    Password
</label>
    <g:passwordField name="password"/>

</div>

<div class="fieldcontain">
%{--@declare id="notify"--}%<label for="notify">
    Do you want email notifications
</label>
    <g:checkBox name="notify"/>

</div>

<div class="fieldcontain">
%{--@declare id="gender"--}%<label for="gender">
    Gender:
</label>
    <g:radioGroup labels="['Male', 'Female']" values="['M', 'F']"  name="gender">
        ${it.label} ${it.radio}

    </g:radioGroup>

</div>

<div class="fieldcontain">
%{--@declare id="marketing"--}%<label for="marketing">
    How did you hear about us?
</label>
    <g:select from="['Internet', 'Friend', 'Other']" name="marketing"/>

</div>